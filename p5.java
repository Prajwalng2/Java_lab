import java.util.Scanner;

public class StringComparison {

    // Version 1: Compare two strings
    static boolean strcmp(String str1, String str2) {
        return str1.equals(str2);
    }

    // Version 2: Compare specified number of characters from the beginning of str1 with str2
    static boolean strcmp(String str1, String str2, int numChars) {
        if (numChars < 0) {
            System.out.println("Invalid number of characters. Please provide a non-negative number.");
            return false;
        }

        // Use substring to compare only the specified number of characters
        String substring1 = str1.substring(0, Math.min(numChars, str1.length()));
        String substring2 = str2.substring(0, Math.min(numChars, str2.length()));
        return substring1.equals(substring2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two strings from the user
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Compare the entire strings
        boolean result1 = strcmp(string1, string2);
        if(result1 == true){
        System.out.println("Entered 2 strings are equal");
        }
        else{
             System.out.println("Entered 2 strings are not equal");
        }

        // Compare the specified number of characters
        System.out.print("Enter the number of characters to compare: ");
        int numChars = scanner.nextInt();
        boolean result2 = strcmp(string1, string2, numChars);
        if(result2 == true){
        System.out.println("strings are equal upto specified number of characters");
        }
        else{
            System.out.println("strings are not equal upto specified number of characters");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

