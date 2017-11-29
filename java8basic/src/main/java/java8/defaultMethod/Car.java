package java8.defaultMethod;

/**
 * 第二种解决方案可以使用 super 来调用指定接口的默认方法：
 * @author whxiang
 * @date 2017/11/27
 */
public class Car implements Vehicle {
    @Override
    public void name() {
        Vehicle.super.name();
    }


    public void call(String name) {
        Vehicle.call(name);
    }
}
