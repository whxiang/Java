package java8.functionInterface;

import java.util.List;
import java.util.function.Predicate;

/**
 * Predicate<T>接口是一个函数式接口，它接收一个输入参数，返回一个布尔值结果
 * 该接口包含多种默认方法来将Predicate组合成其它复杂的逻辑
 * 该接口用于测试对象是true或者false
 *
 * @author whxiang
 * @date 2017/11/27
 */
public class PredicateDemo {
    /**
     * 测试Predicate
     *
     * @param list
     * @param predicate
     */
    public static void eval(List<Integer> list, Predicate<Integer> predicate) {
        list.forEach(s -> {
            if (predicate.test(s)) {
                System.out.println(s);
            }
        });
    }

}
