
java 8日期时间api

java 8通过发布新的Date-Time Api来进一步加强对日期与时间的处理。

在旧版的java中，日期和时间存在诸多问题，其中有：
<ul>
  <li><b>非线程安全</b>-java.util.Date是非线程安全，所有的日期类都是可变的，这是java日期类最大的问题之一</li>
  <li><b>设计很差</b>-java的日期类的定义并不一致，在java.util和java.sql的包中都是日期类，此外用于格式
      和解析的类在java.text包中定义。java.util.Date同时包含日期和时间，而java.sql.Date仅包含日期，将其纳入java.sql
      包并不合理。另外这两个类都有相同的名字，这本身是一个很糟糕的设计。
  </li>
   <li><b>时区处理麻烦</b>-日期类并不提供国际化，没有时区支持，因此java引入了java.util.Calendar和
    java.util.TimeZone类，但是他们同样存在上述问题。
  </li>
</ul>


java 在java.time包含下提供了很多种API,以下两个比较重要的API
1.Local(本地) -简化了日期时间的处理，没有时区的概念。
2.Zoned(时区)- 通过制定的时区处理时期时间。

java 8在java time包含覆盖了所有处理日期，时间，日期时间，时区，时刻，过程与时种的操作









