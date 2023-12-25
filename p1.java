import java.util.Arrays;
import java.util.Scanner;

public class MathOperations {

    static Scanner scanner = new Scanner(System.in);

    static void calculateRectangleArea() {
        System.out.print("Enter length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter width of the rectangle: ");
        double width = scanner.nextDouble();
        System.out.println("Area of the rectangle: " + (length * width));
    }

    static int[] multiplyArrays() {
        System.out.print("Enter length of the arrays: ");
        int length = scanner.nextInt();

        int[] array1 = new int[length];
        int[] array2 = new int[length];

        System.out.println("Enter elements for array1:");
        for (int i = 0; i < length; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for array2:");
        for (int i = 0; i < length; i++) {
            array2[i] = scanner.nextInt();
        }

        return Arrays.stream(array1).map(i -> i * array2[i]).toArray();
    }

    static void bubbleSort(int[] array, boolean ascending) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if ((ascending && array[j] > array[j + 1]) || (!ascending && array[j] < array[j + 1]))
                    array[j] = array[j] + array[j + 1] - (array[j + 1] = array[j]);
    }

    public static void main(String[] args) {
        calculateRectangleArea();

        int[] resultArray = multiplyArrays();
        System.out.println("Result of array multiplication: " + Arrays.toString(resultArray));

        System.out.print("Enter length of the array to be sorted: ");
        int arrayLength = scanner.nextInt();
        int[] unsortedArray = new int[arrayLength];

        System.out.println("Enter elements for the array to be sorted:");
        for (int i = 0; i < arrayLength; i++) {
            unsortedArray[i] = scanner.nextInt();
        }

        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));

        bubbleSort(unsortedArray.clone(), true);
        System.out.println("Ascending Order: " + Arrays.toString(unsortedArray));

        bubbleSort(unsortedArray.clone(), false);
        System.out.println("Descending Order: " + Arrays.toString(unsortedArray));

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
