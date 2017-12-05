/**
 * @author whxiang
 * @date 2017/12/4
 */
public class ConstantPool {

    public void print() {

        String a="123";

        String b="123";

        String c=a+b;


        System.out.println(c=="123123");
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a == b);
        System.out.println(a.getClass());
        System.out.println(b.getClass());
        System.out.println(a.equals(b));

        String string = new String("123");
        System.out.println(string.getClass());

        String string1= new String("123");
        System.out.println(string1.getClass());

        System.out.println(string==a);

        System.out.println(string == string1);

        System.out.println(string.hashCode());
        System.out.println(string1.hashCode());
        System.out.println(string.equals(string1));


        Byte aa=new Byte((byte) 127);
        byte bb=(byte) 127;

        Integer cc=new Integer(129652);
        int dd=129652;
        System.out.println(cc==dd);

        System.out.println("CC->DD:"+aa.toString()==String.valueOf(bb));

        System.out.println("aa==bb:"+(aa==bb)+aa+bb);

        System.out.println();
    }
}
