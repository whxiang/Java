Java 8 Stream
  Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据
  
  Stream使用一种类似使用SQL语句从数据库查询的直观方式来提供一种对Java集合运算和表达式的高阶抽象
  
  Stream API可以极大提供java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
  
 这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
 元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
  
  
  stream of elements------>filter---->sorted------>map--->collect
  
  什么是Stream?
  
  
  Stream（流）是一个来自数据源的元素队列并支持聚合操作
  元素是特定类型的对象,形成一个队列，Java中的Stream并不会存储元素，而是按需计算。
  
  数据源流的来源，可以是集合，数组,IO/Channel，产生器generator等,
  
  聚合操作 类似SQL语句一样的操作，比如filter,map,reduce,find,match,sorted等
  
  和以前的Collection操作不同，Stream操作还有两个基础的特征:
  
  Pipelining:中间操作都会返回流对象本身。这样多个操作可以串联成一个管道，如同流式风格。这样做可以对操作进行优化
  
  比如延迟执行和短路。
  
  内部迭代：以前对集合遍历都是通过iterator或者for-each的方式，显式的在集合外部进行迭代,这叫外部迭代。
  
  Stream提供了内部迭代的方式，通过访问者模式(Visitor)实现。
  
  生成流：
  在java 8中，集合接口中有两个方法来生成流
  
  stream()-为集合创建串行流
  
  parallelStream()-为集合创建并行流。
  
  
  为什么需要 Stream?
  Stream 作为 Java 8 的一大亮点，它与 java.io 包里的 InputStream 和 OutputStream 
  是完全不同的概念。它也不同于 StAX 对 XML 解析的 Stream，
  也不是 Amazon Kinesis 对大数据实时处理的 Stream。Java 8 中的 Stream 
  是对集合（Collection）对象功能的增强，它专注于对集合对象进行各种非常便利、
  高效的聚合操作（aggregate operation），或者大批量数据操作 (bulk data operation)。
  Stream API 借助于同样新出现的 Lambda 表达式，极大的提高编程效率和程序可读性。
  同时它提供串行和并行两种模式进行汇聚操作，并发模式能够充分利用多核处理器的优势，
  使用 fork/join 并行方式来拆分任务和加速处理过程。通常编写并行代码很难而且容易出错,
  但使用 Stream API 无需编写一行多线程的代码，就可以很方便地写出高性能的并发程序。
  所以说，Java 8 中首次出现的 java.util.stream 是一个函数式语言+多核时代综合影响的产物。
  
  
什么是流?
Stream 不是集合元素，它不是数据结构并不保存数据，它是有关算法和计算的，它更像一个高级版本的 Iterator。原始版本的 Iterator，
用户只能显式地一个一个遍历元素并对其执行某些操作；高级版本的 Stream，用户只要给出需要对其包含的元素执行什么操作，
比如 “过滤掉长度大于 10 的字符串”、“获取每个字符串的首字母”等，Stream 会隐式地在内部进行遍历，做出相应的数据转换。

Stream 就如同一个迭代器（Iterator），单向，不可往复，数据只能遍历一次，遍历过一次后即用尽了，就好比流水从面前流过，一去不复返。

而和迭代器又不同的是，Stream 可以并行化操作，迭代器只能命令式地、串行化操作。顾名思义，当使用串行方式去遍历时，
每个 item 读完后再读下一个 item。而使用并行去遍历时，数据会被分成多个段，其中每一个都在不同的线程中处理，然后将结果一起输出。
  
  
流的构成
当我们使用一个流的时候，通常包括三个基本步骤：
获取一个数据源（source）→ 数据转换→执行操作获取想要的结果，每次转换原有 Stream 对象不改变，
返回一个新的 Stream 对象（可以有多次转换），这就允许对其操作可以像链条一样排列，变成一个管道，如下图所示。

图 1. 流管道 (Stream Pipeline) 的构成
stream->source->transforming values->operations
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  