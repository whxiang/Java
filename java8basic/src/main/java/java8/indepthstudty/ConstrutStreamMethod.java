package java8.indepthstudty;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author whxiang
 * @date 2017/11/30
 */
public class ConstrutStreamMethod {

    /**
     * test
     */
    public void print() {

        //region 构造流的几种常见方法
        //1.individual values
        Stream stream = Stream.of("a", "b", "c");

        //A2.rrays
        String[] strarray = {"a", "b", "c"};
        Stream<String> stream1 = Stream.of(strarray);
        Stream<String> stringStream = Arrays.stream(strarray);

        //3.collections
        List<String> stringList = Arrays.asList(strarray);
        Stream<String> stringStream1 = stringList.stream();
        //endregion


        //region 数值流构建
        IntStream.of(new int[]{1, 2, 3}).forEach(System.out::println);
        IntStream.range(1, 3).forEach(System.out::println);
        IntStream.rangeClosed(1, 3).forEach(System.out::println);
        //endregion

        //region 流转换为其它数据结构
        //1.Array
        //Object[] objects = stream.toArray(String[]::new);
        //2.Collection
        //Object collect = stream.collect(Collectors.toList());
        //endregion




    }

}
