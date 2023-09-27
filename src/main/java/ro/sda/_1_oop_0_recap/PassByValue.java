package ro.sda._1_oop_0_recap;

public class PassByValue {

    public static void main(String[] args) {

        int myValue = 5;
        increment(myValue);
        System.out.println(myValue);
    }

    public static void increment(int a){
        a += 100;
    }
}
