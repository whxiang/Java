package java8.defaultMethod;

import org.junit.Test;


/**
 * Created by whxiang on 2017/11/27.
 */
public class CarTest {
    @Test
    public void name() throws Exception {
        new  Car().name();
    }

    @Test
    public void call() throws Exception {
        new  Car().call("car");
    }

}