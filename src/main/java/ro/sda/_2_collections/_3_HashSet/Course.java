package ro.sda._2_collections._3_HashSet;
/*
  Create a class Course that has the following properties:
    -> id (int): a private field representing the unique identifier of the course.
    -> name (String): a private field representing the name of the course.
    -> description (String): a private field representing the description of the course.
    -> credit (int): a private field representing the credit of the course.
    -> a constructor that takes in an int representing the course ID, a String representing the course name,
          a String representing the course description, and an int representing the course credit, and initializes
          the corresponding fields accordingly.
    -> getId(): a method that returns the ID of the course.
    -> getName(): a method that returns the name of the course.
    -> getDescription(): a method that returns the description of the course.
    -> getCredit(): a method that returns the credit of the course.
    -> equals(Object obj): an overridden method that compares the id, name, description, and credit fields
          of two Course objects for equality.
    -> hashCode(): an overridden method that uses the id, name, description, and credit fields in
          its calculation for generating hash code.
 */

import java.util.Objects;

public class Course {
    private int id;
    private String name;
    private String description;
    private int credit;

    public Course(int id, String name, String description, int credit) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getCredit() {
        return credit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Course course)) return false;
        return getId() == course.getId() && getCredit() == course.getCredit() && Objects.equals(getName(), course.getName()) && Objects.equals(getDescription(), course.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getDescription(), getCredit());
    }
}


