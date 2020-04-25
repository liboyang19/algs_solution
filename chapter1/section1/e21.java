package section1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class e21 {
    public static void main(String[] args) {
        StdOut.printf("%-10s %-5s %-5s %-10s\n", "Name", "Hit", "All", "HitRate");
        while (!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int hit = StdIn.readInt();
            int allBall = StdIn.readInt();
            double hitRate = hit / allBall;
            StdOut.printf("-10s %-5d %-5d %-7.3f\n", name, hit, allBall, hitRate);
        }
    }
}
