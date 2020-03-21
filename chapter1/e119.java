public class e119 {
    public static void main(String[] args) {
        System.out.println(convertBin(8));
    }
    private static String convertBin(int x) {
        String s = "";
        while (x > 0) {
            s = (x % 2) + s;
            x /= 2;
        }
        return s;
    }
}
