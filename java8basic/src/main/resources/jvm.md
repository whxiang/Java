6. Java虚拟机（JVM）的新特性

PermGen空间被移除了，取而代之的是Metaspace（JEP 122）。
JVM选项-XX:PermSize与-XX:MaxPermSize分别被-XX:MetaSpaceSize与-XX:MaxMetaspaceSize所代替。