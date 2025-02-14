class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    void fourWheels() {
        System.out.println("I have 4 wheels.");
    }
}

class Bike extends Vehicle {
    void twoWheels() {
        System.out.println("I have 2 wheels.");
    }
}

class Truck extends Vehicle {
    void heavyLoad() {
        System.out.println("I can carry heavy loads.");
    }
}


public class Hierarchical {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();
        Truck myTruck = new Truck();

        myCar.start();
        myCar.fourWheels();

        myBike.start();
        myBike.twoWheels();

        myTruck.start();
        myTruck.heavyLoad();
    }
}