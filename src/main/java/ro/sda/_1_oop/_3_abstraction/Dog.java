package ro.sda._1_oop._3_abstraction;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("dog -> eating....");

    }

    @Override
    public void breath() {
        System.out.println("dog -> breathing");

    }
}
