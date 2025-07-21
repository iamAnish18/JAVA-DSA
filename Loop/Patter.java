public class Patter {
    public static void main(String[] args) {

        // Question 1
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ");
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
        }

        // Question 2
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
        }

        // Question 3
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
        }

        // Question 4
        char letter = 'A';
        for (int i = 1; i <= 4; i++) {
            System.out.println(" ");
            for (int j = 1; j <= i; j++) {
                System.out.print(letter);
                letter++;
            }
        }
        
    }
}
