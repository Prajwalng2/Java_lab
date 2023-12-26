import java.util.Scanner;

class Person {
    String name, gender;
    int age;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void displayDetails(String role, int id) {
        System.out.println(role + " ID: " + id);
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\n--------------------------");
    }
}

class Employee extends Person {
    public Employee(String name, int age, String gender, int employeeId) {
        super(name, age, gender);
        displayDetails("Employee", employeeId);
    }
}

class Student extends Person {
    public Student(String name, int age, String gender, int studentId) {
        super(name, age, gender);
        displayDetails("Student", studentId);
    }
}

public class PersonDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for five employees:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Employee " + i + ":");
            new Employee(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());
        }

        System.out.println("Enter details for five students:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Student " + i + ":");
            new Student(scanner.next(), scanner.nextInt(), scanner.next(), scanner.nextInt());
        }

        scanner.close();
    }
}
