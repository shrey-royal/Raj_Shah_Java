class Parent {
    String name;

    Parent(String name) {
        this.name = name;
    }

    public void printParent() {
        System.out.println("I'm from parent class");
    }
}

class Child extends Parent {

    Child(String name) {
        super(name);    //super() will call the constructor of parent class
    }

    public void printChild() {
        System.out.println("I'm from child class");
    }
}

public class Single {
    public static void main(String[] args) {
        Child c = new Child("Raj");

        c.printParent();
        c.printChild();
        System.out.println("My Name is " + c.name);
    }
}
