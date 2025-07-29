/*
1. Write a program to print whether a number is even or odd, also take input from the user.
2.Take name as input and print a greeting message for that particular name.
3. Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
5. Take 2 numbers as input and print the largest number.
6. Input currency in rupees and output in USD.
7. To calculate Fibonacci Series up to n numbers.
8. To find out whether the given String is Palindrome or not.
9. To find Armstrong Number between two given number.*/


import java.util.*;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Q1
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("it is even");
        } else {
            System.out.println("it is odd number");
        }
        // Q2
        System.out.print("Enter you name = ");
        String name = sc.nextLine();
        System.out.println("Welcome " + name);
        // Q3
        int P = sc.nextInt();
        int R = sc.nextInt();
        int T = sc.nextInt();
        int SimpleInterest = (P * R * T) / 100;
        System.out.println(SimpleInterest);
        // Q4

        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }

        // Q5
        float rs = sc.nextInt();
        System.out.println((float)(rs * 86.87));

        // Q6
        int fib = sc.nextInt();
        int fist = 0;
        int second = 1;
        System.out.println(fist);
        System.out.println(second);
        for (int i = 2; i < fib; i++) {
            int newVal = fist + second;
            System.out.println(newVal);
            fist = second;
            second = newVal;
        }

        // Q7
        String pal = sc.next();
        String str = pal.toLowerCase();
        int left = 0;
        int right = str.length() -1;
        while (left < right) {
            if(str.charAt(left) != str.charAt(right)){
                System.out.println("not a Palindrome = " + str);
            }else{
                System.out.println(" Palindrome = " + str);
            }
            left++;
            right--;
        }

        // Q8
        int armNum = sc.nextInt();
        int original = armNum;
        int pow = String.valueOf(armNum).length();
        int sum = 0;
        while (armNum != 0) {
            int temp = armNum % 10;
            int max = (int) Math.pow(temp, pow);
            sum += max;
            armNum = armNum / 10;
        }
        if (original == sum) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }


        sc.close();
    }
}
