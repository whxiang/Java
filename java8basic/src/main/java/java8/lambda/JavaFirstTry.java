package java8.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author whxiang
 * @date 2017/11/27
 */
public class JavaFirstTry {

    /**
     * java 8 the first try
     * @param names
     * @return
     */
    public void tryfrist(List<String> names) {
        //Can be replaced with Comparator.naturalOrder names.sort((s1,s2)->s1.compareTo(s2));
        names.sort((s1,s2)->s1.compareTo(s2));

    }
}
