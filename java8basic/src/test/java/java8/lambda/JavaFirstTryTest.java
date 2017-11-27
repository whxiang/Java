package java8.lambda;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by whxiang on 2017/11/27.
 */
public class JavaFirstTryTest {
    @Test
    public void tryFristTest() {
        List<String> names = new ArrayList();
        names.add("B");
        names.add("C");
        names.add("A");
        new JavaFirstTry().tryfrist(names);
        Assert.assertEquals("[A, B, C]", names.toString());
    }

}