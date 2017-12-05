/**
 * @author whxiang
 * @date 2017/12/4
 */
public class StringBufferDemo {
    /**
     * 测试StringBuffer
     */
    public void print() {
        //public final class String implements java.io.Serializable, Comparable<String>, CharSequence
        String s = "This is String  public final class String implements java.io.Serializable, Comparable<String>, CharSequence";
        System.out.println(s.length());
        StringBuffer stringBuffer = new StringBuffer(1);
        stringBuffer.append(s);

    }


}
