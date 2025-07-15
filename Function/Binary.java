import java.util.*;

public class Binary {
    public static int binarytoDecimal(int binNumber) {
        int pow = 0;
        int decNum = 0;
        int originalBin = binNumber;

        while (binNumber > 0) {
            int lastDigit = binNumber % 10;

            if (lastDigit != 0 && lastDigit != 1) {
                System.out.println("Invalid binary number. Only 0 and 1 are allowed.");
                return -1;
            }

            decNum += lastDigit * (int) Math.pow(2, pow);
            pow++;
            binNumber /= 10;
        }

        System.out.println("Binary number: " + originalBin + " → Decimal: " + decNum);
        return decNum;
    }

    public static int DecimaltoBinary(int bin){
        int pow = 0;
        int deciNumber = 0;
        int n = bin;
        while (bin>0) {
            int rem = bin%2;
            if(bin ==0){
                System.out.println("invalide input");
                return -1;
            }
            deciNumber += (int)rem*Math.pow(10, pow);
            bin /= 2;
            pow ++;
        }
        System.out.println("binary number " + n + " to decimal number " + deciNumber);
        return deciNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary value = ");
        int binNumber = sc.nextInt();

        int bintoDecimal = binarytoDecimal(binNumber);
        if (bintoDecimal != -1) {
            System.out.println("Decimal value: " + bintoDecimal);
        }

        DecimaltoBinary(12);
    }
}
