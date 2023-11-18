
import java.util.Scanner;

class Employee {
    String name;
    int age, salary;
    long phnno;
    String address;

    void printSalary() {
        System.out.println("Salary of the employee: " + salary);
    }
}

class Officer extends Employee {
    String specialization;
}

class Manager extends Employee {
    String department;
}

public class Program {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Officer of = new Officer();
        Manager mg = new Manager();

        System.out.println("Enter the name of the Officer:");
        of.name = sc.nextLine();

        System.out.println("Enter the age of the Officer:");
        of.age = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the Phone Number of the Officer:");
        of.phnno = sc.nextLong();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the salary of the Officer:");
        of.salary = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the specialization of the Officer:");
        of.specialization = sc.nextLine();

        System.out.println("Enter the address of the Officer:");
        of.address = sc.nextLine();

        System.out.println("Enter the name of the Manager:");
        mg.name = sc.nextLine();

        System.out.println("Enter the age of the Manager:");
        mg.age = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the Phone Number of the Manager:");
        mg.phnno = sc.nextLong();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the salary of the Manager:");
        mg.salary = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        System.out.println("Enter the department of the Manager:");
        mg.department = sc.nextLine();

        System.out.println("Enter the address of the Manager:");
        mg.address = sc.nextLine();

        mg.printSalary();
        of.printSalary();
    }
}

