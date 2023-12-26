import java.util.Scanner;

public class ComplexNumber {
    private double real;
    private double imaginary;

    // Constructor to initialize complex numbers
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Getter for real part
    public double getReal() {
        return real;
    }

    // Getter for imaginary part
    public double getImaginary() {
        return imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(sumReal, sumImaginary);
    }

    // Method to subtract two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        double diffReal = this.real - other.real;
        double diffImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(diffReal, diffImaginary);
    }

    // Method to compare two complex numbers
    public boolean isEqual(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read user input for the first complex number
        System.out.println("Enter the real and imaginary parts for Complex Number 1:");
        double real1 = scanner.nextDouble();
        double imaginary1 = scanner.nextDouble();
        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

        // Read user input for the second complex number
        System.out.println("Enter the real and imaginary parts for Complex Number 2:");
        double real2 = scanner.nextDouble();
        double imaginary2 = scanner.nextDouble();
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        // Display the complex numbers
        System.out.println("Complex Number 1: " + complex1.getReal() + " + " + complex1.getImaginary() + "i");
        System.out.println("Complex Number 2: " + complex2.getReal() + " + " + complex2.getImaginary() + "i");

        // Perform addition and display the result
        ComplexNumber sumResult = complex1.add(complex2);
        System.out.println("Addition Result: " + sumResult.getReal() + " + " + sumResult.getImaginary() + "i");

        // Perform subtraction and display the result
        ComplexNumber subtractResult = complex1.subtract(complex2);
        System.out.println("Subtraction Result: " + subtractResult.getReal() + " + " + subtractResult.getImaginary() + "i");

        // Compare the complex numbers and display the result
        if (complex1.isEqual(complex2)) {
            System.out.println("Complex Number 1 is equal to Complex Number 2");
        } else {
            System.out.println("Complex Number 1 is not equal to Complex Number 2");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

