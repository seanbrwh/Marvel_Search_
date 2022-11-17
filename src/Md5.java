import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5 {
    public static String createHash(String md5) {
        try {
            MessageDigest md = MessageDigest.getInstance("md5");
            byte[] byteArray = md.digest(md5.getBytes());
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteArray.length; i++) {
                sb.append(Integer.toHexString((byteArray[i] & 0xFF | 0x100)).substring(1, 3));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException error) {
            System.out.println(error);
        }
        return null;
    }
}
