public class Main {
    public static void main(String[] args) {
        String name = null;
        System.out.println("Before Exception");

        try {
            System.out.println(12/1);   //Arithmetic Exception
            System.out.println(name.length());  //NullPointerException
        } catch (Exception e) {
            // System.out.println("Arithmetic Exception Occurred!");
            e.printStackTrace();
        }

        System.out.println("After Exception");
    }
}
/*
Exceptions are the errors that occurs at runtime.
Exception Handling is a technique to handle the runtime errors.
When any exception occurs the program will be terminated.

Tasks:
Problem Statement: Division by Zero Handling

You are asked to create a program that divides two numbers. The user will input two integers: the numerator and the denominator. Your task is to handle the following exception:

ArithmeticException: When the user attempts to divide by zero.

The program should display an error message and allow the user to try again.

Requirements:

1. Create a method `divide(int numerator, int denominator)` that performs division.
2. If the denominator is 0, catch the exception and display the message `"Cannot divide by zero!"`.
3. The program should then ask the user for input again.

Example of Output:

Enter numerator: 10
Enter denominator: 2
Result: 5

Enter numerator: 10
Enter denominator: 0
Cannot divide by zero! Please try again.

*/