final class Fun {
    // final void fun() {
    //     System.out.println("This is FUN!");
    // }

    void fun1() {
        System.out.println("This is Fun!");
    }
}

// class Fun2 extends Fun {
//     // @Override
//     // void fun() { // Final Restricts the user from overriding the method
//     //     System.out.println("FUN is overriden!");
//     // }

//     // @Override
//     // void fun1() {
//     //     System.out.println("This is overrided fun!");
//     // }
// }

public class Final_Kw {
    public static void main(String[] args) {
        final double PI = 3.14; // constant
        System.out.println("Value of PI: " + PI);

        // Fun2 f2 = new Fun2();
        // f2.fun();
    }
}
/*
Constants are the data that can't be changed.
In Java, we have final keyword to make variables, methods, final constants.

Problem Statement:
-> Scenario: Bank Security System with `final` Keyword  

- A bank wants to ensure that certain critical values, methods, and classes in its security system cannot be changed or overridden.  

1. Final Variable: The bank’s system has a fixed interest rate that should never be modified.  
2. Final Method: The method for calculating interest should be protected from being overridden by subclasses.  
3. Final Class: The bank’s security rules should be enforced by a class that cannot be extended by any other class.  

-> Task:  
Write a Java program that:  
- Declares a `final double INTEREST_RATE = 5.0;` inside a `BankAccount` class and attempts to modify it.  
- Defines a `final` method `calculateInterest()` inside `BankAccount` and tries to override it in a subclass.  
- Creates a `final` class `BankSecurity` and attempts to extend it in another class.
*/