/*
Abstraction : Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Abstract Class: A class with the abstract keyword is called an abstract class. It can have abstract and non-abstract methods.

0%-100% abstraction is possible in abstract class.

Rules for Abstract class:

1. must declare with abstract keyword.
2. it can have abstract and non-abstract methods.
3. it cannot be instantiated.
4. it can have constructors and static methods also.
5. it can have final methods which will force the subclass not to change the body of the method.

*/

abstract class Person {
    String name;
    int age;

    abstract void display();    // abstract method (hidden method)

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student extends Person {
    int rollNo;

    Student(String name, int age, int rollNo) {
        super(name, age);
        this.rollNo = rollNo;
    }

    @Override
    void display() {    //specific implementation
        System.out.println("Name: " + name + "\nAge: " + age + "\nRoll No.: " + rollNo);
    }
}


public class AbstractClass {
    public static void main(String[] args) {
        // Person p = new Person("raj", 14);
        Student s = new Student("Raj", 14, 102);
        s.display();
    }
}

/*

1. Shape Hierarchy (Abstract Class with Shapes)
Problem Scenario: Create an abstract class Shape that has two attributes: name (String) and area (double). The class should have an abstract method calculateArea() that will be implemented in the subclasses. Additionally, provide a constructor to initialize the name. Create subclasses Circle and Rectangle that extend Shape and implement the calculateArea() method.

2. Vehicle Hierarchy (Abstract Class with Vehicles)
Problem Scenario: Create an abstract class Vehicle with attributes brand (String) and speed (int). The class should have an abstract method startEngine() to be implemented in the subclasses. Additionally, provide a constructor to initialize the brand and speed. Create subclasses Car and Bike that extend Vehicle and implement the startEngine() method.

*/