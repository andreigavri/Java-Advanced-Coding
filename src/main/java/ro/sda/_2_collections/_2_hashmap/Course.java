package ro.sda._2_collections._2_hashmap;
/*
Create a class called "Course" with the following properties: name, instructor, and capacity.
Include getters and setters for each property.
 */
public class Course {
    private String name;
    private String instructor;
    private int capacity;

    public Course(String name, String instructor, int capacity) {
        this.name = name;
        this.instructor = instructor;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
