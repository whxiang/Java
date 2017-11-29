package java8.defaultMethod;

/**
 * Java 8 的另一个特性是接口可以声明（并且可以提供实现）静态方法
 *
 * @author whxiang
 * @date 2017/11/27
 */
public interface Vehicle {

    default void name() {
        System.out.println("It is car");
    }

    static void call(String name) {
        System.out.println("I am " + name);
    }

}
