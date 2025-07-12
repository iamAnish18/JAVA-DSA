import java.util.Scanner;

public class Pratices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Question 1

        System.out.print("Enter the value of A = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of B = ");
        int b = sc.nextInt();
        System.out.print("Enter the value of c = ");
        int c = sc.nextInt();

        int avg = (a + b + c) / 3;
        System.out.println("Average of a,b and c = " + avg);

        // Question 2

        System.out.print("Enter the value of side of square = ");
        int side = sc.nextInt();
        int square = side * side;
        System.out.println("Area of Square = " + square);

        // Question 3
        
        System.out.print("Enter the price of pencil = ");
        float pencil = sc.nextFloat();
        System.out.print("Enter the price of pen = ");
        float pen = sc.nextFloat();
        System.out.print("Enter the price of eraser = ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.print("Total bill = " + total);
        float gstbill = (float) (total + total * 0.18);
        System.out.print("Total bill with gst = " + gstbill);
    }
}
