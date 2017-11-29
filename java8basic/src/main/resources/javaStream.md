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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  