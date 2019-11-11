package base64;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Test {
    /**
     * JDK8的 Base64加密，相较于以前的JDK中sun.misc包下的Base64加密效率更高
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        Base64.Encoder encoder =Base64.getEncoder();
        Base64.Decoder decoder = Base64.getDecoder();
        String password ="this is password";
        byte[] text = encoder.encode(password.getBytes("UTF-8"));
        text = decoder.decode(text);

    }
}
