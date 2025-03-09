import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.util.Base64;

public class AESCrypto {
    public static void main(String[] args) throws Exception {
        // Gerar uma chave secreta AES
        KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
        keyGenerator.init(128); // Tamanho da chave
        SecretKey secretKey = keyGenerator.generateKey();
        System.out.println("Chave :"+secretKey);
        // Mensagem original
        String mensagem = "Olá, criptografia em Java!";
        
        // Criptografar
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] mensagemCriptografada = cipher.doFinal(mensagem.getBytes());

        // Converter para Base64 para facilitar a visualização
        String mensagemCifradaBase64 = Base64.getEncoder().encodeToString(mensagemCriptografada);
        System.out.println("Mensagem Criptografada: " + mensagemCifradaBase64);

        // Descriptografar
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] mensagemDecifrada = cipher.doFinal(mensagemCriptografada);
        System.out.println("Mensagem Descriptografada: " + new String(mensagemDecifrada));
    }
}
