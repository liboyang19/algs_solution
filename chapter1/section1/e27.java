package section1;

public class e27 {
    static int advCount = 0;
    static int count = 0;
    public static double binomial(int N, int k, double p) {
        double[][] arrNK = new double[N + 1][k + 1];

        for (int i = 0; i < arrNK.length; i++) {
            for (int j = 0; j < arrNK[0].length; j++) {
                arrNK[i][j] = -1;
            }
        }
        return helperBinomial(N, k, p, arrNK);
    }

    private static double helperBinomial(int N, int k, double p, double[][] arr) {
        advCount++;
        System.out.println("Invoke " + advCount + " times.");
        if ((N == 0) && (k == 0)) return 1.0;
        if ((N < 0) || (k < 0)) return 0.0;
        double result = arr[N][k];
        if (result == -1) {
            result = (1.0 - p)*helperBinomial(N-1, k, p, arr) + p*helperBinomial(N-1, k-1, p, arr);
            arr[N][k] = result;
        }
        return result;
    }

    public static double binomial2(int N, int k, double p) {
        count++;
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p)*binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }

    public static void main(String[] args) {
        //System.out.println("The result is " + binomial(100, 50, 0.25));
        System.out.println("The result is " + binomial2(100, 50, 0.25));
    }
}
