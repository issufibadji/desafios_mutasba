package javaapplication29;

import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class TesteDeCriptografia {

    public static void main(String[] args) throws Exception {

        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128);
        SecretKey secretKey = keyGenerator.generateKey();

        String msg = "oiiiiiiiiiiiiiiiii";

        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] msCriptada = cipher.doFinal(msg.getBytes());
        String conversor = Base64.getEncoder().encodeToString(msCriptada);
//        System.out.println(conversor);

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] msdes = cipher.doFinal(msCriptada);
        System.out.println(new String(msdes));

    }
}
