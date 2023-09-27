package ro.sda._1_oop_0_recap;

public class Person {

    // every class in Java is a child of Object class(Object class is the parte of all the classes in java)
//
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

