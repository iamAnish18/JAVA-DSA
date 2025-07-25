import java.util.*;
import java.util.Arrays;
import java.util.Collection;

public class Shorting {
    public static void BubbleShorting(Integer num[]) {
        int swap = 0;
        for (int i = 0; i < num.length - 1; i++) {
            swap = 0;

            for (int j = 0; j < num.length - 1 - i; j++) {
                if (num[j] > num[j + 1]) {
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swap++;
                }
            }

        }
        if (swap == 0) {
            System.out.println("it is allready shoting array");
        } else {
            System.out.println("it is not a shoting array");
        }
    }

    public static void SelectionShorting(Integer num[]){
        for(int i = 0;i<num.length - 1;i++){
            int minValue = i;
            for(int j=i+1;j<num.length;j++){
                if(num[minValue] > num[j]){
                    minValue = j;
                }
            }
            // swapping
            int temp = num[minValue];
            num[minValue] = num[i];
            num[i] = temp;
        }
    }

    public static void InsertionShorting(Integer num[]){
        for(int i = 1;i<num.length;i++){
            int curr = num[i];
            int prev = i-1;
            while (prev>=0 && num[prev] > curr) {
                num[prev + 1] = num[prev];
                prev--;  // <--- THIS moves the comparison leftwards
            }
            num[prev + 1] = curr;
        }
    }

    public static void printArr(Integer num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String argu[]) {
        Scanner sc = new Scanner(System.in);
        Integer num[] = { 5,4,1,3,2 };
        // BubbleShorting(num);
        // SelectionShorting(num);
        // InsertionShorting(num);
        // Arrays.sort(num);
        Arrays.sort(num , Collections.reverseOrder());
        printArr(num);
    }
}
