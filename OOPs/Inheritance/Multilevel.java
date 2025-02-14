class Animal {
    void eat() {
        System.out.println("I can eat.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("I can bark.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("I can weep.");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();

        myPuppy.eat();
        myPuppy.bark();
        myPuppy.weep();
    }
}
