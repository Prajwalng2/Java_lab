import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the numerator (positive integer): ");
            int numerator = scanner.nextInt();

            if (numerator <= 0) {
                throw new InputMismatchException("Numerator must be a positive integer.");
            }

            System.out.print("Enter the denominator (non-zero integer): ");
            int denominator = scanner.nextInt();

            if (denominator == 0 || denominator <= 0) {
                throw new ArithmeticException("Denominator cannot be zero or negative Number");
            }

            double result = (double) numerator / denominator;
            System.out.println("Result of division: " + result);
        } catch (InputMismatchException | ArithmeticException e) {
            System.err.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}
