package ro.sda._2_collections._3_HashSet;
/*

Create a student class with the following:
    -> id (int): a private field representing the unique identifier of the student.
    -> name (String): a private field representing the name of the student.
    -> courses (HashSet<Course>): a private field representing the set of courses that the student is currently enrolled in.
    -> a constructor that takes in an int representing the student ID and a String representing the student name, and initializes the id and name fields accordingly.
    -> enroll(Course course): a method that takes in a Course object representing the course that the student wants to enroll in, and adds it to the courses set.
    -> drop(Course course): a method that takes in a Course object representing the course that the student wants to drop, and removes it from the courses set.
    -> getCourses(): a method that returns the set of courses that the student is currently enrolled in.

 */

import java.util.HashSet;

public class Student {

    private int id;
    private String name;

    private HashSet<Course> coursesSet;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.coursesSet = new HashSet<>();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public HashSet<Course> getCoursesSet() {
        return coursesSet;
    }

    public void enroll(Course course) {
        coursesSet.add(course);
    }

    public void drop(Course course) {
        coursesSet.remove(course);
    }

    public void printEnrolledCourses() {
        System.out.println(this.name + "'s enrolled courses");
        for (Course c : coursesSet) {
            System.out.println("\t" + c.getName());
        }
    }
}
