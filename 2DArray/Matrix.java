import java.util.*;

public class Matrix {

    public static int BigNumber(int matrix[][]) {
        int large = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] > large) {
                    large = matrix[i][j];
                }
            }
        }
        return large;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(" ");
        }

        int SearchLargeNum = BigNumber(matrix);
        System.out.println("Largest number in matrix" + SearchLargeNum);
    }
}
