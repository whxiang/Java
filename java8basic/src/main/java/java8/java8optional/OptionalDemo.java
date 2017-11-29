package java8.java8optional;

import java.util.Optional;

/**
 * @author whxiang
 * @date 2017/11/28
 */
public class OptionalDemo {


    /**
     * test optional
     */
    public void optionalDemo() {
        OptionalDemo optionalDemo = new OptionalDemo();

        Integer integer = null;
        Integer integer1 = new Integer(10);

        //Optional.ofNullable 允许传递null参数
        Optional<Integer> integerOptional = Optional.ofNullable(integer);

        //Optional.of 如果传的参数是null,抛出异常NullPointerException
        Optional<Integer> optional = Optional.of(integer1);

        //isPresent
        System.out.println("The first value exist:" + integerOptional.isPresent());
        System.out.println("The first value exist:" + optional.isPresent());

        //ifPresent
        optional.ifPresent(System.out::println);
        integerOptional.ifPresent(System.out::println);

        //get
        Integer integer2 = optional.get();
        System.out.println(integer2);

        //orElse
        Integer integer3 = integerOptional.orElse(new Integer(123));
        System.out.println(integer3);

        //orElseGet
        Integer integer4 = optional.orElseGet(this::GetInt);
        System.out.println(integer4);


    }

    public int GetInt() {
        return 10;
    }

}
