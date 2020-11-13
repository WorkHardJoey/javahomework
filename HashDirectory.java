package hashDirectory;

import java.io.*;
import java.util.*;
import java.security.MessageDigest;

public class HashDirectory {

    public static String SHA1Checksum(File f) throws Exception {
        FileInputStream is = new FileInputStream(f);
        byte[] buffer = new byte[1024];
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        int numRead = 0;
        do {
            numRead = is.read(buffer);
            if (numRead > 0) {
                complete.update(buffer, 0, numRead);
            }
        } while (numRead != -1);
        is.close();
        return digestToString(complete);
    }

    public static String SHA1Checksum4Str(String str) throws Exception {
        MessageDigest complete = MessageDigest.getInstance("SHA-1");
        complete.update(str.getBytes());
        return digestToString(complete);
    }

    public static String SHA1Checksum4Dir(String path) throws Exception {
        File dir = new File(path);
        File[] fs = dir.listFiles();

        if (fs==null) {return null;}
        else {Arrays.sort(fs);}

        String str = "";
        for (File f: fs) {
            if (f.isFile()) {
                str += f.getName();
                str += SHA1Checksum(f);
            }
            if (f.isDirectory()) {
                str += f.getName();
                str += SHA1Checksum4Dir(path + File.separator + f.getName());
            }
        }
        return SHA1Checksum4Str(str);
    }

    public static String digestToString(MessageDigest complete) {
        byte[] sha1 = complete.digest();
        String result = "";
        for (byte each : sha1) {result += Integer.toString(each&0xFF, 16);}
        return result;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("\nPls enter the path: ");
        String path = input.nextLine();
        input.close();

        try {
            System.out.print("\nSHA-1: ");
            System.out.println(SHA1Checksum4Dir(path));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}