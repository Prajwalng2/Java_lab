import java.util.Scanner;

class Person {
    protected String name;
    protected int age;
    protected String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    public void readDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter age: ");
        this.age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        System.out.print("Enter gender: ");
        this.gender = scanner.nextLine();
    }
}

class Employee extends Person {
    private String employeeId;
    private String designation;

    public Employee(String name, int age, String gender, String employeeId, String designation) {
        super(name, age, gender);
        this.employeeId = employeeId;
        this.designation = designation;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Designation: " + designation);
    }

    @Override
    public void readDetails() {
        super.readDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        this.employeeId = scanner.nextLine();
        System.out.print("Enter Designation: ");
        this.designation = scanner.nextLine();
    }
}

class Student extends Person {
    private String studentId;
    private String course;

    public Student(String name, int age, String gender, String studentId, String course) {
        super(name, age, gender);
        this.studentId = studentId;
        this.course = course;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Student ID: " + studentId);
        System.out.println("Course: " + course);
    }

    @Override
    public void readDetails() {
        super.readDetails();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.studentId = scanner.nextLine();
        System.out.print("Enter Course: ");
        this.course = scanner.nextLine();
    }
}

public class Main {
    public static void main(String[] args) {
        // Display details of at least five employees
        System.out.println("Details of Employees:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nEmployee " + (i + 1) + ":");
            Employee employee = new Employee("Employee" + (i + 1), 30 + i, "Male", "EMP" + (i + 1), "Position" + (i + 1));
            employee.readDetails();
            employee.displayDetails();
        }

        // Display details of at least five students
        System.out.println("\nDetails of Students:");
        for (int i = 0; i < 5; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            Student student = new Student("Student" + (i + 1), 20 + i, "Female", "STU" + (i + 1), "Course" + (i + 1));
            student.readDetails();
            student.displayDetails();
        }
    }
}
