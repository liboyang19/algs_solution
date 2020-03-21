public class e1113 {
    public static void main(String[] args) {
        int[][] arr = new int[3][5];
        int sum = 1;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 5; ++j) {
                arr[i][j] = sum;
                sum++;
            }
        }
        printTranspose(arr);
    }

    private static void printTranspose(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        for (int j = 0; j < col; ++j) {
            for (int i = 0; i < row; ++i) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
