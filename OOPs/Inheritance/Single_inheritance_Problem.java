class Vehicle {
    String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    void honk() {
        System.out.println("Beep! Beep!");
    }
}

class Car extends Vehicle {
    String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

public class Single_inheritance_Problem {
    public static void main(String[] args) {
        Car c = new Car("Toyota", "Corolla");

        c.honk();
        c.displayDetails();
    }
}