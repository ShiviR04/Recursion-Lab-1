import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 0 to stop the program");
            System.out.println("Enter the number you would like to factorial: ");
            int number = scanner.nextInt();
            while (number < 0) {
                System.out.println("Enter a number 0 or greater!\nTry again");
                number = scanner.nextInt();
            }
            if (number == 0) {
                System.out.println("Thank you");
                System.exit(0);
            }
            System.out.println(factorial(number));
            System.out.println("\n\n");
        }
    }
    private static int factorial(int number) {
        if (number == 1) return number;
        return number * factorial(number - 1);
    }
}
