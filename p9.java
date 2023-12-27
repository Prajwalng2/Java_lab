import java.util.Scanner;

interface Computer {
    void convert();
}

class StorageConverter implements Computer {
    private double kilobytes;

    public StorageConverter(double kilobytes) {
        this.kilobytes = kilobytes;
    }

    @Override
    public void convert() {
        double gigabytes = kilobytes / (1024 * 1024); // Conversion from kilobytes to gigabytes
        System.out.println(kilobytes + " Kilobytes is equal to " + gigabytes + " Gigabytes");
    }
}

class CurrencyConverter implements Computer {
    private double euros;

    public CurrencyConverter(double euros) {
        this.euros = euros;
    }

    @Override
    public void convert() {
        double rupees = euros * 90; // Conversion rate: 1 Euro = 90 Rupees
        System.out.println(euros + " Euros is equal to " + rupees + " Rupees");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of kilobytes
        System.out.print("Enter the number of kilobytes: ");
        double kilobytesInput = scanner.nextDouble();

        // Take user input for the number of euros
        System.out.print("Enter the number of euros: ");
        double eurosInput = scanner.nextDouble();

        // Demonstrate storage conversion
        StorageConverter storageConverter = new StorageConverter(kilobytesInput);
        System.out.println("Storage Conversion:");
        storageConverter.convert();

        System.out.println();

        // Demonstrate currency conversion
        CurrencyConverter currencyConverter = new CurrencyConverter(eurosInput);
        System.out.println("Currency Conversion:");
        currencyConverter.convert();

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

