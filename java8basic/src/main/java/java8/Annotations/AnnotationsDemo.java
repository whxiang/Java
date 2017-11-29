package java8.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @author whxiang
 * @date 2017/11/29
 */
public class AnnotationsDemo {

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE_USE,ElementType.TYPE_PARAMETER})
    public @interface NotEmpty {
    }

    public static class Holder<@NotEmpty T> extends @NotEmpty Object {

        public  void  method()throws  @NotEmpty Exception {
            @NotEmpty Collection<@NotEmpty String> strings = new ArrayList<>();
        }
    }



}
