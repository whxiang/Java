package java8.repeatAnnotation;

import java.io.FilterReader;
import java.lang.annotation.*;

/**
 * @author whxiang
 * @date 2017/11/29
 */
public class RepeatingAnnotions {

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Filters {
        Filter[] value();
    }

    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    @Repeatable(Filters.class)
    public @interface Filter {
        String value();
    }

    @Filter("filter1")
    @Filter("filter2")
    public @interface Filterable {
    }

    public void print() {
        for (Filter filter : Filterable.class.getAnnotationsByType(Filter.class)) {
            System.out.println(filter.value());
        }
    }




}
