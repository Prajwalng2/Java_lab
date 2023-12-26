import java.util.Scanner;

public class EmployeeDatabase {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int numEmployees = 5;
        Employee[] employees = new Employee[numEmployees];

        // Read and display details of employees
        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = readEmployeeDetails();
        }

        // Display all employees
        System.out.println("\nDetails of all Employees:");
        displayAllEmployees(employees);

        // Calculate and display the sum of salary of "sales" department
        String departmentToSum = "sales";
        double salesDeptSalarySum = calculateDepartmentSalarySum(employees, departmentToSum);
        System.out.println("\nSum of salaries for employees in the \"" + departmentToSum + "\" department: " + salesDeptSalarySum);

        // Retrieve details of the highest paid manager in the "purchase" department
        String departmentToRetrieve = "purchase";
        Employee highestPaidManager = retrieveHighestPaidManager(employees, departmentToRetrieve);

        if (highestPaidManager != null) {
            System.out.println("\nDetails of the highest paid manager in the \"" + departmentToRetrieve + "\" department:");
            displayEmployeeDetails(highestPaidManager);
        } else {
            System.out.println("\nNo manager found in the \"" + departmentToRetrieve + "\" department.");
        }
    }

    static Employee readEmployeeDetails() {
        Employee employee = new Employee();
        System.out.print("Name: ");
        employee.name = scanner.nextLine();
        System.out.print("Emp_id: ");
        employee.empId = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Department: ");
        employee.department = scanner.nextLine();
        System.out.print("Age: ");
        employee.age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Designation: ");
        employee.designation = scanner.nextLine();
        System.out.print("Salary: ");
        employee.salary = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character
        return employee;
    }

    static void displayAllEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            displayEmployeeDetails(employee);
        }
    }

    static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.name);
        System.out.println("Emp_id: " + employee.empId);
        System.out.println("Department: " + employee.department);
        System.out.println("Age: " + employee.age);
        System.out.println("Designation: " + employee.designation);
        System.out.println("Salary: " + employee.salary);
        System.out.println();
    }

    static double calculateDepartmentSalarySum(Employee[] employees, String department) {
        double sum = 0;
        for (Employee employee : employees) {
            if (employee.department.equalsIgnoreCase(department)) {
                sum += employee.salary;
            }
        }
        return sum;
    }

    static Employee retrieveHighestPaidManager(Employee[] employees, String department) {
        Employee highestPaidManager = null;
        double maxSalary = 0;
        for (Employee employee : employees) {
            if (employee.department.equalsIgnoreCase(department) && employee.designation.equalsIgnoreCase("manager") && employee.salary > maxSalary) {
                maxSalary = employee.salary;
                highestPaidManager = employee;
            }
        }
        return highestPaidManager;
    }

    static class Employee {
        String name;
        int empId;
        String department;
        int age;
        String designation;
        double salary;
    }
}
