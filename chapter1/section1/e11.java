package section1;

public class e11 {
    public static void main(String[] args) {
        boolean[][] arr = new boolean[8][8];
        print2D(arr);
    }

    private static void print2D(boolean[][] arr) {
        /* Suppose that the shape of arr is [row][col]*/
        int col = arr[0].length;
        int row = arr.length;
        System.out.print(" ");
        /* Print column number.*/
        for(int i = 0; i < col; i++) {
            System.out.print(i);
        }
        System.out.println("");
        for(int i = 0; i < row; i++) {
            System.out.print(i);
            for(int j = 0; j < col; j++) {
                printDesired(arr[i][j]);
            }
            System.out.println("");
        }
    }

    private static void printDesired(boolean x) {
        if (x) {
            System.out.print("t");
        } else {
            System.out.print("f");
        }
    }
}
