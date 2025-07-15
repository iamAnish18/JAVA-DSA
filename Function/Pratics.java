import java.util.*;

public class Pratics {

    public static int Average(int a, int b, int c) {
        int avg = (a + b + c) / 3;
        return avg;
    }

    public static boolean isEven(int n) {
        boolean even = true;
        if (n % 2 == 0) {
            even = true;
        } else {
            even = false;
        }
        return even;
    }

    public static boolean isPalindrome(int palindrome){
        boolean isPalin = true;
        int rem = 0;
        int div = palindrome;
        while (palindrome!=0) {
            int remainder = palindrome%10;
            rem = rem*10 + remainder;
            div = div/10;
        }

        if(div == rem){
            isPalin = true;
        }else{
            isPalin = false;
        }
        return isPalin;
    }

    public static int digitSum(int nSum){
        int allDigit = nSum;
        int sum = 0;
        while (allDigit != 0) {
            sum += allDigit%10;
            allDigit = allDigit/10; 
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of A =");
        int a = sc.nextInt();
        System.out.print("Enter the value of B =");
        int b = sc.nextInt();
        System.out.print("Enter the value of C =");
        int c = sc.nextInt();
        System.out.print("Enter the value of n to check even or not =");
        int n = sc.nextInt();
        System.out.print("enter the three digit number =");
        int palindrome = sc.nextInt();
        System.out.print("enter the value to all digit = ");
        int nSum = sc.nextInt();

        int avg = Average(a, b, c);
        System.out.println("Average of a ,b and c = " + avg);

        boolean even = isEven(n);
        System.out.println("Even = " + even);

        boolean isPalindrome = isPalindrome(palindrome);
        System.out.println("it is palindrome number = " + isPalindrome);

        int allDigit = digitSum(nSum);
        System.out.println("Sum of all digit value = " + allDigit);
    }
}
