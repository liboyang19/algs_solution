package section1;

public class e5 {
    public static void main(String[] args) {
        isStrictlyBetween(0.82,0.122);
    }
    private static void isStrictlyBetween(double x, double y) {
        if (x > 0 && x < 1 && y > 0 && y < 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
