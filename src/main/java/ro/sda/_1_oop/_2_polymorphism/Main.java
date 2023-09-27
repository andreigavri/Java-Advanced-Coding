package ro.sda._1_oop._2_polymorphism;
// Create a base class called Car
// It should have a few fields that would be appropriate for a generic car class.
// engine, cylinders, wheels, etc.
// Constructor should initialize cylinders (number of) and name, and set wheels to 4
// and engine to true. Cylinders and names would be passed parameters.
//
// Create appropriate getters
//
// Create some methods like startEngine, accelerate, and brake
//
// show a message for each in the base class
// Now create 3 subclasses for your favorite vehicles.
// Override the appropriate methods to demonstrate polymorphism in use.
// put all classes in the one java file (this one).

public class Main {

    public static void main(String[] args) {
        Car c1 = new Car(true, 200, "Mercedes", "S Class ");
        c1.startEngine();
        c1.accelerate();
        c1.accelerate(100);

        //audi is a subclass of the car class and because of the polymorphism
        // we can use a variable of a type Car and hold a reference of the subclass(Audi)
        Car audi= new Audi(true,1500,"Audi", "A6");
        audi.startEngine();
        audi.accelerate();
        audi.accelerate(250);

    }
}

class Car {

    private boolean hasEngine;
    private int numberOfCylinders;
    private String brand;
    private String model;

    public Car(boolean hasEngine, int numberOfCylinders, String brand, String model) {
        this.hasEngine = hasEngine;
        this.numberOfCylinders = numberOfCylinders;
        this.brand = brand;
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Car -> startEngine()");


    }

    public void accelerate() {
        System.out.println("Car -> accelerate()");
    }

    //overloading
    public void accelerate(int speed) {
        System.out.println("Car -> accelerate() with: " + speed);
    }
}

class Audi extends Car {

    public Audi(boolean hasEngine, int numberOfCylinders, String brand, String model) {
        super(hasEngine, numberOfCylinders, brand, model);
    }

    @Override
    public void accelerate() {
        System.out.println("Audi -> accelerate()");
    }

    @Override
    public void startEngine() {
        System.out.println("Audi -> startEngine()");
    }
}
