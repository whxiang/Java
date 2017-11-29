package java8.functionInterface;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by whxiang on 2017/11/27.
 */
public class PredicateDemoTest {
    @Test
    public void eval() throws Exception {
        List<Integer> list = Arrays.asList(1, 2, 7);
        PredicateDemo.eval(list, n -> n % 2 == 0);
    }

}