import java.util.Scanner;

class Bank {
    String name;
    long accountNo;
    double balance;

    public Bank(String name, long accountNo, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        name = scanner.nextLine();
        System.out.print("Enter account number: ");
        accountNo = scanner.nextLong();
        System.out.print("Enter account balance: ");
        balance = scanner.nextDouble();
    }

    public void displayDetails() {
        System.out.println("\n Customer Name: " + name);
        System.out.println("Account Number: " + accountNo);
        System.out.println("Account Balance: " + balance);
    }

    public void calculateInterest(double interestRate, String bankName) {
        double interestEarned = (balance * interestRate)/100;
        System.out.println("Interest Earned at " + bankName + ":" + interestEarned);
    }
}

class Citibank extends Bank {
    public Citibank(String name, long accountNo, double balance) {
        super(name, accountNo, balance);
    }
}

class SbiBank extends Bank {
    public SbiBank(String name, long accountNo, double balance) {
        super(name, accountNo, balance);
    }
}

class CanaraBank extends Bank {
    public CanaraBank(String name, long accountNo, double balance) {
        super(name, accountNo, balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Citibank account:");
        Citibank citiAccount = new Citibank("", 0, 0);
        citiAccount.readDetails();
        System.out.print("Enter Citibank interest rate: ");
        double citiInterestRate = scanner.nextDouble();

        System.out.println("Enter details for SBI Bank account:");
        SbiBank sbiAccount = new SbiBank("", 0, 0);
        sbiAccount.readDetails();
        System.out.print("Enter SBI Bank interest rate: ");
        double sbiInterestRate = scanner.nextDouble();

        System.out.println("Enter details for Canara Bank account:");
        CanaraBank canaraAccount = new CanaraBank("", 0, 0);
        canaraAccount.readDetails();
        System.out.print("Enter Canara Bank interest rate: ");
        double canaraInterestRate = scanner.nextDouble();

        citiAccount.calculateInterest(citiInterestRate, "Citibank");
        citiAccount.displayDetails();

        System.out.println();

        sbiAccount.calculateInterest(sbiInterestRate, "SBI Bank");
        sbiAccount.displayDetails();

        System.out.println();

        canaraAccount.calculateInterest(canaraInterestRate, "Canara Bank");
        canaraAccount.displayDetails();

        scanner.close();
    }
}
