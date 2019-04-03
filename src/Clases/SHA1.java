package Clases;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA1 {

    public static String sha1(String message) throws NoSuchAlgorithmException{
        MessageDigest mDigest = MessageDigest.getInstance("SHA-1");
        //mDigest.reset();
        byte[] result = mDigest.digest(message.getBytes());
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i<result.length;i++)
            sb.append(Integer.toString((result[i] & 0xff) + 0x100, 16).substring(1));
        
        return sb.toString();
        
    }
    
    private static String convertHex(String message, byte[] byteMessage){
        String resultado = "";
        for (int i=0; i<byteMessage.length; i++){
            System.out.println("Valor Hexadecimal del byte " + i + "= " + Integer.toString((byteMessage[i] & 0xff), 16));
            resultado += Integer.toString((byteMessage[i] & 0xff), 16);
        }
        
        return resultado;
    }
    
    public static boolean verifyHash(String file, String hash) throws NoSuchAlgorithmException, IOException{
        MessageDigest mdSHA1 = MessageDigest.getInstance("SHA-1");
        //mdSHA1.reset();
        FileInputStream fis = new FileInputStream(file);
        byte[] data = new byte[1024];
        int content =0;
        
        while ((content = fis.read(data))!= -1)
            mdSHA1.update(data, 0, content);
        
        byte[] hashBytes = mdSHA1.digest();
        StringBuffer sb = new StringBuffer();
        
        for(int i=0; i<hashBytes.length; i++)
            sb.append(Integer.toString((hashBytes[i] & 0xff) + 0x100, 16).substring(1));
        
        String fileHash = sb.toString();
        return fileHash.equals(hash);
    }
    
    public static void main(String[] args) throws NoSuchAlgorithmException, IOException {
        System.out.println(sha1("NIDIA"));
        System.out.println("Resultado del checksum = " + verifyHash("m_hash.txt", "5ada5181435c4d37f281a95279429dba015cdfaf"));
    }
    
}