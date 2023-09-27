package ro.sda._5_comparable;

public class Person  implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int agel) {
        this.name = name;
        this.age = agel;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", agel=" + +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        Integer.compare(this.age, o.age);

        return 0;
    }
}

