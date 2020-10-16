package hackerank.javatask;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class JavaMD5 {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes();
        byte[] result = md5.digest(bytes);
        for (byte b : result) {
            System.out.format("%02x", b);
        }
    }
}
