import java.util.*;

public class AdvancedPatter {

    public static void HollowRectangle(int tolRow, int tolCol) {
        for (int i = 1; i <= tolRow; i++) {
            for (int j = 1; j <= tolCol; j++) {
                if (i == 1 || i == tolRow || j == 1 || j == tolCol) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }

    public static void HalfPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }

    public static void HalfPyramidNumber() {
        for (int i = 1; i <= 5; i++) {
            for (int j = i; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }

    public static void FlodTriangle() {
        int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HollowRectangle(4, 5);
        HalfPyramid(4);
        HalfPyramidNumber();
        FlodTriangle();
    }
}
