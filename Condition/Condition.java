import java.util.Scanner;

public class Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1

        System.out.print("Enter your A = ");
        int a = sc.nextInt();
        System.out.print("Enter your B = ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("A is greater number");
        } else {
            System.out.println("B is greater number");
        }

        // Question 2
        System.out.print("Enter the Random value = ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("it is even number");
        } else {
            System.out.println("it is odd number");
        }

        // Question 3
        System.out.print("Enter your income = ");
        int income = sc.nextInt();
        if (income <= 500000) {
            System.out.println("0% tax");
        } else if (income > 500000 && income <= 1000000) {
            System.out.println("10% tax");
        } else {
            System.out.println("20% tax");
        }

        // Question 4
        System.out.print("Enter the value of p = ");
        int p = sc.nextInt();
        System.out.print("Enter the value of q = ");
        int q = sc.nextInt();
        System.out.print("Enter the value of r = ");
        int r = sc.nextInt();

        if (p > q && p > r) {
            System.out.println("p is greater number");
        } else if (q > r) {
            System.out.println("q is greater number");
        } else {
            System.out.println("r is greater number");
        }

        // Question 5
        System.out.print("Enter you math marks = ");
        int marks = sc.nextInt();

        // using ternary operatus
        String check = marks > 33 ? "pass" : "fail";
        System.out.println(check);

        // Question 6
        System.out.print("Enter the random number");
        int status = sc.nextInt();

        if (status >= 0) {
            System.out.println("it is positive number");
        } else {
            System.out.println("it is negative number");
        }

        // Question 7
        double temp = 107.5;
        if (temp > 100) {
            System.out.println("you are suffering from fever");
        } else {
            System.out.println("good health");
        }

        // Question 8
        System.out.print("Enter the week number from 1 to 7 = ");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter wrong input");
        }
    }
}
