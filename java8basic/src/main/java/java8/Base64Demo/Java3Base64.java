package java8.Base64Demo;

import java.io.UnsupportedEncodingException;
import java.util.Base64;
import java.util.UUID;

/**
 * @author whxiang
 * @date 2017/11/29
 */
public class Java3Base64 {

    
    public void Base64Demo() throws UnsupportedEncodingException {

        //Base64 基本编码
        String encodeToString = Base64.getEncoder().encodeToString("ruoob?java8".getBytes("utf-8"));
        System.out.println("Base64 使用基本编码 :" + encodeToString);

        //Base64 基本解码
        byte[] bytes = Base64.getDecoder().decode(encodeToString);
        System.out.println("原始字符串：" + new String(bytes,"utf-8"));


        //Base64 URL编码
        String encodeToString1 = Base64.getUrlEncoder().encodeToString("TutorialsPoint?java3".getBytes("utf-8"));
        System.out.println("base64 编码字符串(URL):" + encodeToString1);
        //Base64 URL解码
        byte[] decode = Base64.getUrlDecoder().decode(encodeToString1);
        System.out.println("URL原始字符串："+new String(decode,"utf-8"));
        


        StringBuilder stringBuilder = new StringBuilder();
        int count=10;
        for (int i = 0; i < count; i++) {
            stringBuilder.append(UUID.randomUUID().toString());
        }

        //Base64 MiME 编码
        byte[] bytes1 = stringBuilder.toString().getBytes("utf-8");
        String encodeToString2 = Base64.getMimeEncoder().encodeToString(bytes1);
        System.out.println("Base64 MiME编码字符串:" + encodeToString2);
        //Base64 MIME解码
        byte[] bytes2 = Base64.getMimeDecoder().decode(encodeToString2);
        System.out.println("Base MIME 原始字符串:"+new String(bytes2));


    }


}
