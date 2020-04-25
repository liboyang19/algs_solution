package section1;

import java.util.Arrays;

public class e19 {
    static long advCount = 0;
    static long count = 0;

    public static long F(int n) {
        count++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        return F(n-1) + F(n-2);
    }

    // Use an array to cache.
    public static long advF(int n) {
        long[] arr = new long[n+1];
        Arrays.fill(arr, -1);
        return helperF(n, arr);
    }
    private static long helperF(int n, long[] arr) {
        advCount++;
        if (n == 0) return 0;
        if (n == 1) return 1;
        long result = arr[n];
        if (result == -1) {
            result = helperF(n-1, arr) + helperF(n-2, arr);
            arr[n] = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int N = 40;
        System.out.println(N + " " + F(N));
        System.out.println("Invoke " + count + " times.");
        System.out.println(N + " " + advF(N));
        System.out.println("Invoke " + advCount + " times.");
    }
}
