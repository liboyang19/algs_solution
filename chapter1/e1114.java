public class e1114 {
    public static void main(String[] args) {
        for (int i = 0; i < 32; i++) {
            System.out.println("lg(" + i + ") = " + lg(i));
        }
    }
    private static int lg(int N) {
        if (N <= 1) {
            return 0;
        }
        return 1 + lg( N / 2);
    }
}
