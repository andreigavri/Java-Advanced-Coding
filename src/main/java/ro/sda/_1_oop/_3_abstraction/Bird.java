package ro.sda._1_oop._3_abstraction;

public class Bird extends Animal implements CanFly{
    public Bird(String name) {
        super(name);
    }


    @Override
    public void eat() {
        System.out.println("eating.... ");

    }

    @Override
    public void breath() {
        System.out.println("breathing .....");

    }
}
