/**
 * @author whxiang
 * @date 2017/12/4
 *
 * JVM在执行时，首先加载类，然后执行内部的静态块，然后再去调用main方法。
 * 具体：jvm内存加载模型中会详情讲解
 */
public class FirstComplexity {
    static {
        System.out.println("你好~");
    }

    public static void main(String[] args) {
        System.exit(0);
        System.out.println("This is a Complexity");
    }

}
