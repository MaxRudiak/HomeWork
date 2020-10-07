package HomeWork2;

import java.math.BigInteger;

public class HW2_1_4 {
    public static void main(String[] args) {
       long a = 1;
       long b = a * 3;
       long c;
        for (c = b; c < Long.MAX_VALUE;){
            c = (long) (Math.pow(c,3));
        }
        System.out.println(c);
        BigInteger bi1, bi2, bi3;
        bi1 = new BigInteger("9223372036854775807");
        bi2 = new BigInteger("3");
        bi3 = bi1.multiply(bi2);
        System.out.println(bi3);
    }
}
