package section1;

import edu.princeton.cs.algs4.StdOut;

public class e24 {
    private static long gcd(long a, long b) {
        StdOut.printf("p = %d, q = %d \n", a, b);
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println(gcd(1111111, 1234567));
    }
}
