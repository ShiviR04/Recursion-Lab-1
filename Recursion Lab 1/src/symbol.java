import java.util.InputMismatchException;
import java.util.Scanner;

public class symbol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 0 to stop the program");
            System.out.println("Enter the number of symbols you would like to print out: ");
            int number = scanner.nextInt();
            while (number < 0) {
                System.out.println("Enter a number 0 or greater!\nTry again");
                number = scanner.nextInt();
            }
            if (number == 0) {
                System.out.println("Thank you");
                System.exit(0);
            }
            printPercent(number);
            System.out.println("\n\n");
        }
    }

    private static void printPercent(int number) {
        for (int i = 1; i <= number; i++) {
            printPercent(i, number);
        }
    }

    private static void printPercent(int i, int number) {
        for (int j = 0; j < i; j++) {
            System.out.print("% ");
        }
        System.out.println(" ");
    }
}


