package section1;

public class e15 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 4, 2, 1, 3, 5, 6, 1, 1, 1};
        int[] hist = histogram(a, 5);
        for (int num : hist) {
            System.out.println(num);
        }
    }


    private static int[] histogram(int[] a, int M) {
        /* A primitive approach. */
//        int[] hist = new int[M];
//        for (int i = 0; i < M; ++i) {
//            hist[i] = 0;
//            for (int num : a) {
//                if (i == num) {
//                    hist[i] += 1;
//                }
//            }
//        }
//        return hist;

        /* A better solution. */
        int[] newArr = new int[M];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < M) {
                newArr[a[i]]++;
            }
        }
        return newArr;
    }
}
