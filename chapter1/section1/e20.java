package section1;

public class e20 {
    public static double lgFactorial(int N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + lgFactorial(N - 1);
    }
    public static void main(String[] args) {
        System.out.println("lg(5!) = " + lgFactorial(5));
    }
}
