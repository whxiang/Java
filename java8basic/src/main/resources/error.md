Java 8中10个不易察觉的错误

1、不小心重用了流
IntStream stream = IntStream.of(1, 2);
stream.forEach(System.out::println);
 
// That was fun! Let's do it again!
stream.forEach(System.out::println);
你会碰到一个这样的错误：
java.lang.IllegalStateException: stream has already been operated upon or closed

2、不小心创建了一个"无限"流

你可能一不留神就创建了一个无限流。就拿下面这个例子来说：

IntStream.iterate(0, i -> i + 1)
.forEach(System.out::println);
流的问题就在于它有可能是无限的，如果你的确是这样设计的话。
唯一的问题就是，这并不是你真正想要的。因此，你得确保每次都给流提供一个适当的大小限制：

// That's better
IntStream.iterate(0, i -> i + 1).limit(10).forEach(System.out::println);

3、不小心创建了一个"隐藏的"无限流
IntStream.iterate(0, i -> ( i + 1 ) % 2).distinct().limit(10).forEach(System.out::println);


4、不小心创建了一个"隐藏"的并行无限流
我还是想继续提醒下你，你可能真的一不小心就消费了一个无限流。假设你认为distinct()操作是会并行执行的。那你可能会这么写：

IntStream.iterate(0, i -> ( i + 1 ) % 2)
.parallel()
.distinct()
.limit(10)
.forEach(System.out::println);

5、操作的顺序
为什么我一直在强调你可能一不小心就创建了一个无限流？很简单。因为如果你把上面的这个流的limit()和distinct()操作的顺序掉换一下，一切就都OK了。
IntStream.iterate(0, i -> ( i + 1 ) % 2)
.limit(10)
.distinct()
.forEach(System.out::println);

6、还是操作顺序
既然说到了SQL，如果你用的是MySQL或者PostgreSQL，你可能会经常用到LIMIT .. OFFSET子句。SQL里全是这种暗坑，这就是其中之一。正如SQL Server 2012中的语法所说明的那样，OFFSET子名会优先执行。
如果你将MySQL/PostgreSQL方言转化成流的话，得到的结果很可能是错的：
IntStream.iterate(0, i -> i + 1)
.limit(10) // LIMIT
.skip(5) // OFFSET
.forEach(System.out::println);
警惕LIMIT .. OFFSET和OFFSET .. LIMIT的陷阱！

7、使用过滤器来遍历文件系统



 
8、修改流内部的集合
当遍历列表的时候，你不能在迭代的过程中同时去修改这个列表。这个在Java 8之前就是这样的，
不过在Java 8的流中则更为棘手。看下下面这个0到9的列表：
// Of course, we create this list using streams:
List<Integer> list =
IntStream.range(0, 10)
.boxed()
.collect(toCollection(ArrayList::new));
现在，假设下我们在消费流的时候同时去删除元素：

list.stream()
// remove(Object), not remove(int)!
.peek(list::remove)
.forEach(System.out::println);

ava.util.ConcurrentModificationException

如果我们捕获异常后再查看下这个列表，会发现一个很有趣的事情。得到的结果是：

9、忘了去消费流

IntStream.range(1, 5)
.peek(System.out::println)
.peek(i -> {
if (i == 5)
throw new RuntimeException("bang");
});

杯具。忘了调用execute方法了


10、并行流死锁
Object[] locks = { new Object(), new Object() };
 
IntStream
.range(1, 5)
.parallel()
.peek(Unchecked.intConsumer(i -> {
synchronized (locks[i % locks.length]) {
Thread.sleep(100);
 
synchronized (locks[(i + 1) % locks.length]) {
Thread.sleep(50);
}
}
}))
.forEach(System.out::println);


结论
引入了流和函数式编程之后，我们开始会碰到许多新的难以发现的BUG。这些BUG很难避免，
除非你见过并且还时刻保持警惕。你必须去考虑操作的顺序，还得注意流是不是无限的。