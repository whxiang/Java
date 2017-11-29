package java8.javaTimeApi;

import java.time.*;

/**
 * @author whxiang
 * @date 2017/11/28
 */
public class JavaDateApi {

    /**
     * test
     */
    public void localDateTime() {
        //LocalDateTime
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("now time:" + currentTime);

        //LocalDate
        LocalDate localDate = currentTime.toLocalDate();
        System.out.println("date:" + localDate);

        Month month = currentTime.getMonth();
        int dayOfMonth = currentTime.getDayOfMonth();
        int second = currentTime.getSecond();
        System.out.println("month:" + month + "  day" + dayOfMonth + ",second" + second);


        LocalDateTime localDateTime = currentTime.withDayOfMonth(10).withYear(1);
        System.out.println("date2:" + localDateTime);

        //LocalDate
        LocalDate localDate1 = LocalDate.of(2017, Month.JUNE, 12);
        System.out.println(localDate1);


        //LocalTime
        LocalTime localTime = LocalTime.of(22, 15);
        System.out.println("localTime:" + localTime);

        //LocalTime parse
        LocalTime parse = LocalTime.parse("20:11:11");
        System.out.println("parseLocalTime:" + parse);


        //ZonedDateTime
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2015-12-03T10:15:30+05:30[Asia/Shanghai]");
        System.out.println("zonedDateTime:" + zonedDateTime);

        //zoneId
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("zoneId:" + zoneId);

        ZoneId systemDefault = ZoneId.systemDefault();
        System.out.println("当前时区:"+systemDefault);
    }

}
