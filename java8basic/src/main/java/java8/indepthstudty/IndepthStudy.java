package java8.indepthstudty;

import sun.java2d.pipe.SpanIterator;

import java.io.PrintStream;
import java.util.Collection;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import static java8.indepthstudty.IndepthStudy.A.a;

/**
 * @author whxiang
 * @date 2017/11/30
 */
public class IndepthStudy {


    @FunctionalInterface
    public interface A {

        //defaultTest
        default void defaultTest() {
            System.out.println("This A of test");
        }

        //static method
        static void staticTest() {
            System.out.println("This is A of staticTest");
        }

        //static 变量
        static int a = 10;

        //
        static int b = 10;

        void test();

        //support stream
        default Stream stream() {
            //return Spliterators.spliterator(this,0);
            return null;
        }

    }


    @FunctionalInterface
    public interface B {

        //defaultTest
        default void defaultTest() {
            System.out.println("This B of test");
        }

        //static
        static void staticTest() {
            System.out.println("This is B of staticTest");
        }


        static int a = 11;


        void test();

    }


    @FunctionalInterface
    public interface D {
        void test(String s);
    }


    @FunctionalInterface
    public interface E {
        void test(PrintStream out, String s);
    }


    public interface C extends A, B {

        @Override
        default void defaultTest() {
            A.super.defaultTest();
        }

        default void variableStatic() {
            System.out.println(A.a);
            System.out.println(b);
        }

    }

    public void print() {

        C c = new C() {
            @Override
            public void test() {
                System.out.println("This is implement method");
            }
        };

        C c1 = () -> System.out.println("This is implement");

        c.defaultTest();

        c.variableStatic();

        c.test();

        A.staticTest();

        B.staticTest();


        D d = (s) -> System.out.println(s);
        d.test("lambda");

        //使用方法的引用，实例方法的引用
        D dl = System.out::println;
        dl.test("方法引用");


        E e = PrintStream::println;
        e.test(System.out, "第一个参数");
        E ee = (x, y) -> {
            x.println(y);
        };
        ee.test(System.out, "测试");
    }

}
