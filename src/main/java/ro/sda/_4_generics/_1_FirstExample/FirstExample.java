package ro.sda._4_generics._1_FirstExample;

public class FirstExample {

    public static void main(String[] args) {

        Box<String> stringBox = new Box<>();
        stringBox.putInside("something");

        System.out.println(stringBox.getOut());

        var boxGift = new Box<Gift>();
        boxGift.putInside(new Gift("iphone", 1000));

        Gift unwrapped = boxGift.getOut();
        System.out.println(unwrapped);
    }
}

class Box<T> {

    private T objectInside;

    public void putInside(T objectInside) {
        this.objectInside = objectInside;
    }

    public T getOut() {
        return objectInside;
    }

}

class Gift{
    private String name;
    private double price;

    public Gift(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Gift{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

