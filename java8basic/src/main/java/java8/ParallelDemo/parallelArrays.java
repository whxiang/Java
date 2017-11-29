package java8.ParallelDemo;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author whxiang
 * @date 2017/11/29
 */
public class parallelArrays {

    public void print() {
        long[] longs = new long[2000];
        Arrays.parallelSetAll(longs,x-> ThreadLocalRandom.current().nextInt(100000));

        Arrays.stream(longs).limit(10).mapToObj(x->x+" ").forEach(x -> System.out.print(x));

        Arrays.parallelSort(longs);

        Arrays.stream(longs).limit(10).forEach(x-> System.out.println(x+"  "));
    }



}
