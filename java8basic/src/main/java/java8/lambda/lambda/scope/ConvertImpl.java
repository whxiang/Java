package java8.lambda.lambda.scope;

/**
 * @author whxiang
 * @date 2017/11/29
 * lambda 作用域
 * 在lambda表达式中访问外层作用域和老版本的匿名对象中的方式很相似。
 * 你可以直接访问标记了final的外层局部变量，或者实例的字段以及静态变量。
 */
public class ConvertImpl {

    public void Convert() {
        final int num = 1;


        Covert<String,Integer> integerStringConvert=Integer::valueOf;
        System.out.println(integerStringConvert.convert("123"));


        int mum=1;
        Covert<Integer,String> stringCovert= (from)->String.valueOf(from+num);
        System.out.println(stringCovert.convert(num));

        //num=3;





    }
}
