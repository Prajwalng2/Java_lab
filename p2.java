import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    String name, department, designation;
    int employeeId, age;

    public Employee(String name, int employeeId, String department, int age, String designation) {
        this.name = name;
        this.employeeId = employeeId;
        this.department = department;
        this.age = age;
        this.designation = designation;
    }
}

public class EmployeeDatabase {

    static List<Employee> employeeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        readEmployeeDetails(5);
        displayEmployeeDetails();
        System.out.println("Sum of salaries in Sales department: " + calculateSumSalary("sales"));

        Employee highestPaidManager = getHighestPaidManager("purchase");
        System.out.println(highestPaidManager != null
                ? "Details of the highest paid manager in Purchase department:\n" + highestPaidManagerDetails(highestPaidManager)
                : "No manager found in the Purchase department.");
    }

    static void readEmployeeDetails(int numEmployees) {
        for (int i = 1; i <= numEmployees; i++) {
            System.out.println("Enter details for Employee " + i + ":");
            employeeList.add(new Employee(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt(), scanner.next()));
        }
    }

    static void displayEmployeeDetails() {
        System.out.println("\nEmployee Details:");
        employeeList.forEach(EmployeeDatabase::displayEmployeeDetails);
        System.out.println();
    }

    static String highestPaidManagerDetails(Employee employee) {
        return "Name: " + employee.name + "\nEmployee ID: " + employee.employeeId +
                "\nDepartment: " + employee.department + "\nAge: " + employee.age +
                "\nDesignation: " + employee.designation + "\n--------------------------";
    }

    static void displayEmployeeDetails(Employee employee) {
        System.out.println(highestPaidManagerDetails(employee));
    }

    static double calculateSumSalary(String department) {
        return employeeList.stream()
                .filter(e -> e.department.equalsIgnoreCase(department))
                .mapToDouble(e -> 50000) // Placeholder for salary calculation logic
                .sum();
    }

    static Employee getHighestPaidManager(String department) {
        return employeeList.stream()
                .filter(e -> e.department.equalsIgnoreCase(department) && e.designation.equalsIgnoreCase("manager"))
                .max(java.util.Comparator.comparing(e -> 80000)) // Placeholder for salary calculation logic
                .orElse(null);
    }
}
