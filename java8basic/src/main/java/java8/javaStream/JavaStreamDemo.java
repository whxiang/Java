package java8.javaStream;

import javax.sound.midi.Soundbank;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author whxiang
 * @date 2017/11/28
 */
public class JavaStreamDemo {

    /**
     * 流操作
     */
    public void stream() {

        List<String> stringList = Arrays.asList("abc", "bc", "efg", "", "abcd", "jkl");

        //stream->为集合创建串行流。
        Stream<String> stream = stringList.stream();

        //foreach->Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。
        stringList.forEach(System.out::println);

        //->sort
        stringList.sort(String::compareTo);


        //map->方法用于映射每个元素对应的结果，以下代码使用map输出了元素对应平方数
        List<Integer> integerList = Arrays.asList(3, 2, 2, 7, 3, 5);
        List<Integer> integers = integerList.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        integers.forEach(System.out::println);

        //filter->方法用于通过设置的条件过滤出元素
        long count = stream.filter(s -> !s.isEmpty()).count();
        System.out.println(count);

        //limit->limit方法用于获取指定数量的流。
        //sorted->方法用于对流进行排序
        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);


        //parallelStream->是流并行处理程序的替换方法
        long count1 = stringList.parallelStream().filter(s -> !s.isEmpty()).count();
        System.out.println(count1);

        //Collectors->类实现了很多归约操作
        List<String> filtered = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        String collect = stringList.stream().filter(s -> !s.isEmpty()).collect(Collectors.joining(" ,"));
        System.out.println("合并字符串" + collect);


        //统计
        IntSummaryStatistics statistics = integerList.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println("the max number:" + statistics.getMax());
        System.out.println("The min number:" + statistics.getMin());
        System.out.println("The sum number:" + statistics.getSum());
        System.out.println("The average number:" + statistics.getAverage());


    }


}
