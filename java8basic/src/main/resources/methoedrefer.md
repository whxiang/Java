********方法引用通过方法的名字来指向一个方法。
方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
方法引用使用一对冒号(::)。
下面，我们以定义了4个方法的Car这个类作为例子，区分Java中支持的4种不同的方法引用。

1.
构造器引用：它的语法是Class::new，或者更一般的Class<T>::new,实例如下：
final Flight flight=Flight.Create(Flight::new);
final List<Flight> flights=Arrays.asList(car);

2.静态方法引用,它的的语法是Class::static_method,实例如下：
flights.forEach(Flight::collipe)

3.特定类的任意对象的方法引用:它的语法是Class::method实例如下：
Cars.forEach(Flight::repair);

4.特定对象的方法引用,它的语法是instance::method
final Flight flight=Flight.create(Flight::new)
cars.foreach(flight::follow)



