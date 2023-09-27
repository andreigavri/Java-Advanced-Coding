package ro.sda._5_comparable;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(99, 32, 45, 23, 1, 2, 5, 15);
        for (var el : integerList) {
            System.out.println(el);
        }
        Collections.sort(integerList);

        System.out.println("----------------------------");

        for (var el : integerList) {
            System.out.println(el);
        }

        System.out.println("---------------------------------");

        Person p1 = new Person("Catalin", 25);
        Person p2 = new Person("Mihai", 10);
        Person p4 = new Person("Ionut",50);
        Person p3 = new Person("Radu", 5);
        List<Person> personList=Arrays.asList(p1,p2,p4,p3);
        for(var p : personList){
            System.out.println(p);
        }

        System.out.println("---------------------------");

        Collections.sort(personList);

        for(var p : personList) {
            System.out.println(p);
        }
    }
}
