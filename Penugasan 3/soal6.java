import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class soal6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a = new BigInteger(s.next());
        BigInteger b = new BigInteger(s.next());
        BigInteger ad=a.add(b);
        BigInteger mu=a.multiply(b);
        System.out.println(ad);
        System.out.println(mu);
    }
}