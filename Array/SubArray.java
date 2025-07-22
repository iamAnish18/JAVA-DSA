import java.util.*;

public class SubArray {
    public static int MaxSubArray(int num[]) {
        int tlSum = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < num.length; i++) {
            int curr = i;
            for (int j = i; j < num.length; j++) {
                int endval = j;
                tlSum = 0;
                for (int k = curr; k < endval; k++) {
                    System.out.print(num[k] + " ");
                    tlSum += num[k];
                }
                if (max < tlSum) {
                    max = tlSum;
                }
                System.out.println(" ");
            }
        }
        return max;
    }

    public static void maxvaluePrefix(int num[]) {
        int first = 0;
        int maxval = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];
        prefix[0] = num[0];
        for (int i = 1; i < num.length; i++) {
            prefix[i] = prefix[i - 1] + num[i];
        }

        for (int i = 0; i < num.length; i++) {
            int start = i;
            for (int j = 0; j < num.length; j++) {
                int end = j;
                first = i == 0 ? prefix[end] : prefix[end] - prefix[i - 1];
                if (maxval < first) {
                    maxval = first;
                }
            }
        }
        System.out.println("the max value of prefix value = " + maxval);
    }

    public static int kadanesAlgrothim(int arr[]) {
        int mx = Integer.MIN_VALUE;
        int val = 0;
        for(int i = 0;i<arr.length;i++){
            val += arr[i];
            if(val < 0){
                val = 0;
            }else if(mx < val){
                mx = val;
            }
        }
        return mx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num[] = { 2, 4, 6, 8, 10, 12, 14 };
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
        int maxsub = MaxSubArray(num);
        System.out.println("the max value is = " + maxsub);

        maxvaluePrefix(num);

        int kadaneMax = kadanesAlgrothim(arr);
        System.out.println(kadaneMax);
    }
}
