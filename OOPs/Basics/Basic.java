import java.util.Scanner;

class Employee {
    //class members / data members
    int id;
    String name;
    String address;
    String designation;
    double salary;

    //methods
    void scanEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee Id: ");
        id = sc.nextInt();

        sc.nextLine();  // to consume the \n character
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Employee Address: ");
        address = sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        designation = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        salary = sc.nextDouble();
    }

    void printEmployeeDetails() {
        System.out.println(id + "\t" + name + "\t" + address + "\t" + designation + "\t" + salary);
    }
}

public class Basic {
    public static void main(String[] args) {
        Employee emp = new Employee();

        emp.scanEmployeeDetails();

        emp.printEmployeeDetails();
    }
}

/*
Task:

Create a class Student with data members includng id, name, grade, marks. and with methods to scan and print the student details.

*/