import java.util.*;

public class array {

    public static int linearSearch(int check[], int key) {
        for (int i = 0; i < check.length; i++) {
            if (check[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int Greater(int num[]) {
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        for (int i = 0; i < num.length; i++) {
            if (large < num[i]) {
                large = num[i];
            }
            if (small > num[i]) {
                small = num[i];
            }
        }
        System.out.println(small);
        return large;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int check[] = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        int key = 10;

        int num[] = { 0, 1, 2, 3, 4, 5, 8 };
        int index = linearSearch(check, key);
        if (index == -1) {
            System.out.println("not a found");
        } else {
            System.out.println("found in index = " + index);
        }

        int printLarge = Greater(num);
        System.out.println(printLarge);
    }
}
