package ro.sda._1_oop_0_recap;

public class PassByReference {


    public static void main(String[] args) {

        MyClass obj = new MyClass();
        obj.value = 100;
        increment(obj);

        System.out.println(obj.value);

    }

    public static void increment(MyClass obj){
        obj.value+=500;
    }

    static class MyClass{
        public int value;
    }
}
