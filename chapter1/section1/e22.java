package section1;

import edu.princeton.cs.algs4.StdOut;

public class e22 {
    private static int rank(int key, int[] a) {
        return rank(key, a, 0, a.length - 1, -1);
    }

    private static int rank(int key, int[] a, int lo, int hi, int depth) {
        depth++;
        String indent = " ".repeat(depth);
        StdOut.printf(indent + "%-3d %-3d \n", lo, hi);
        if (lo > hi) {
            return -1;
        }
        int mid = lo + (hi - lo) / 2;
        if (key < a[mid]) {
            return rank(key, a, lo, mid - 1, depth);
        } else if (key > a[mid]) {
            return rank(key, a, mid + 1, hi, depth);
        } else {
            return mid;
        }
    }

    public static void main(String[] args) {
        int[] a = new int[16];
        for (int i = 0; i < a.length; i++) {
            a[i] = i;
        }
        System.out.println(rank(15, a));
    }
}
