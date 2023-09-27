package ro.sda._4_generics._2_SecondExample;

public class SecondExample {
    public static void main(String[] args) {
        //Garage<String> stringGarage = new Garage<>();
        //stringGarage.parkTheCar("non-sens");

        Garage<Car>carGarage = new Garage<>();
        carGarage.parkTheCar(new Car("dacia", 10000, "yellow"));
        System.out.println(carGarage.getOut());

        Garage<Audi> audiGarage = new Garage<>();
        audiGarage.parkTheCar(new Audi());
        System.out.println(audiGarage.getOut());

    }
}

class Garage<T extends Car>{
    private T car;

    public void parkTheCar(T car){
        this.car = car;

    }
    public T getOut(){
        return car;

    }
}

class Car{
    public String model;
    public double price;
    public String color;

    public Car(String model, double price, String color) {
        this.model = model;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}

class Audi extends Car{
    public Audi (){
        super("Audi", 50000, "Silver");
    }
}
