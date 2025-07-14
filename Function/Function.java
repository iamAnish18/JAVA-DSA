import java.util.*;

public class Function {

    public static int calculatSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void swapVariable(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Value of a = " + a);
        System.out.println("Value of b = " + b);
        return;
    }

    public static int calculatMulti(int a, int b) {
        int multi = a * b;
        return multi;
    }

    public static int calculatFactorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int binomialCoefficent(int n, int r) {
        int nfact = 1;
        int rfact = 1;
        int rnfact = 1;

        for (int i = 1; i <= n; i++) {
            nfact *= i;
        }
        for (int i = 1; i <= r; i++) {
            rfact *= i;
        }
        for (int i = 1; i <= (n - r); i++) {
            rnfact *= i;
        }

        int binomial = nfact / (rfact * rnfact);
        return binomial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a = ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b = ");
        int b = sc.nextInt();
        System.out.print("Enter the value of n = ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r = ");
        int r = sc.nextInt();

        int sum = calculatSum(a, b);
        // java will passed value always in call by value
        System.out.println("Sum of a and b = " + sum);
        swapVariable(a, b);

        int Multiply = calculatMulti(a, b);
        System.out.println("multiply of a and b = " + Multiply);

        int Factorial = calculatFactorial(n);
        System.out.println("Value of factorial = " + Factorial);

        int CheckBinomial = binomialCoefficent(n, r);
        System.out.println(CheckBinomial);
    }
}
