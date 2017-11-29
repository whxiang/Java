5.2 类依赖分析器jdeps
jdeps是一个很有用的命令行工具。
它可以显示Java类的包级别或类级别的依赖。
它接受一个.class文件，一个目录，或者一个jar文件作为输入。
jdeps默认把结果输出到系统输出（控制台）上。

E:\learning-hard\Java\java8basic\target>jdeps java8.basic-1.0-SNAPSHOT.jar
java8.basic-1.0-SNAPSHOT.jar -> E:\xwh\kit\Java\jdk1.8.0_102\jre\lib\rt.jar
   java8.defaultMethod (java8.basic-1.0-SNAPSHOT.jar)
      -> java.io
      -> java.lang
   java8.functionInterface (java8.basic-1.0-SNAPSHOT.jar)
      -> java.io
      -> java.lang
      -> java.lang.invoke
      -> java.util
      -> java.util.function
   java8.javaStream (java8.basic-1.0-SNAPSHOT.jar)
      -> java.io
      -> java.lang
      -> java.lang.invoke
      -> java.util
      -> java.util.function
      -> java.util.stream
   java8.lambda (java8.basic-1.0-SNAPSHOT.jar)
      -> java.lang
      -> java.lang.invoke
      -> java.util
   java8.methodReference (java8.basic-1.0-SNAPSHOT.jar)
      -> java.io
      -> java.lang
      -> java.util.function
