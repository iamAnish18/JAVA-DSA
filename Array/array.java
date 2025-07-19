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

    public static int BinarySearch(int check[], int key) {
        int start = 0;
        int end = check.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (check[mid] == key) {
                return mid;
            }
            if (check[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }

    public static void ReversArray(int revers[]) {
        int first = 0;
        int last = revers.length - 1;
        while (first < last) {
            int rev = revers[last];
            revers[last] = revers[first];
            revers[first] = rev;
            first++;
            last--;
        }
    }

    public static void ArrayPair(int pair[]) {
        int tp = 0;
        for (int i = 0; i < pair.length; i++) {
            int temp = pair[i];
            for (int j = i + 1; j < pair.length; j++) {
                System.out.print("(" + temp + "," + pair[j] + ")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total number of pair = " + tp);
    }

    public static void Subarray(int pair[]) {
        int printTotal = 0;
        for (int i = 0; i < pair.length; i++) {
            int start = i;
            for (int j = i; j < pair.length; j++) {
                int end = j;
                int sum = 0;
                for (int k = start; k <= end; k++) {
                    System.out.print(pair[k] + " ");  
                    sum += pair[k];          
                }
                printTotal++;
                System.out.println();
                System.out.println("total sum of sumArray = " + sum);
            }
            System.out.println();
        }
        System.out.println("total number of count= " + printTotal);
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

        int BinarySearch = BinarySearch(check, key);
        System.out.println("index of key = " + BinarySearch);

        int revers[] = { 2, 4, 6, 8, 10, 12 };
        ReversArray(revers);
        for (int i = 0; i < revers.length; i++) {
            System.out.println(revers[i]);
        }

        int pair[] = { 2, 4, 6, 8, 10 };

        ArrayPair(pair);
        Subarray(pair);
    }
}
