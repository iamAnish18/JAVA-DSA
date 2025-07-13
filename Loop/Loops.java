import java.util.*;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the random number");
        int num = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for(int j=0;j<= num;j++){
            if(j%2 ==0){
                evenSum += j;
            }else{
                oddSum += j;
            }
        }

        System.out.println(evenSum);
        System.out.println(oddSum);

        System.out.print("Enter the number = ");
        int fact = sc.nextInt();
        int factNumber = 1;
        for(int i=1;i<=fact;i++){
            factNumber *= i;
        }

        System.out.println(factNumber);

        System.out.print("Enter the number to print table = ");
        int table = sc.nextInt();

        for(int i = 1;i<= 10;i++){
            System.out.println(table*i);
        }


        for(int i = 0;i<= 5;i++){
            System.out.println("hello world");
            i += 2;
        }
    }
}
