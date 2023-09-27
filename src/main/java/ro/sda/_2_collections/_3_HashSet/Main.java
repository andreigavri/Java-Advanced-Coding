package ro.sda._2_collections._3_HashSet;


/*
    Exercise: Student Management System
    You are tasked with building a student management system for a university.
    The system should store information about each student, including their name, ID, and a list of courses they are enrolled in.
    You decide to use a HashSet to store the list of courses for each student.

    Requirements:

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

    Create a student class with the following:
    -> id (int): a private field representing the unique identifier of the student.
    -> name (String): a private field representing the name of the student.
    -> courses (HashSet<Course>): a private field representing the set of courses that the student is currently enrolled in.
    -> a constructor that takes in an int representing the student ID and a String representing the student name, and initializes the id and name fields accordingly.
    -> enroll(Course course): a method that takes in a Course object representing the course that the student wants to enroll in, and adds it to the courses set.
    -> drop(Course course): a method that takes in a Course object representing the course that the student wants to drop, and removes it from the courses set.
    -> getCourses(): a method that returns the set of courses that the student is currently enrolled in.

 */


public class Main {
    public static void main(String[] args) {

        Course c1 = new Course(1, "Math", "annoying", 5);
        Course c2 = new Course(2, "Science", "funny", 3);
        Course c3 = new Course(3, "Geography", "interesting", 4);
        Course c4 = new Course(4, "IT", "challenging", 5);
        Course c5 = new Course(4, "IT", "challenging", 5);

        Student s1 = new Student(1, "Paul");
        Student s2 = new Student(2, "Victor");
        Student s3 = new Student(3, "Miguel");

        s1.enroll(c1);
        s1.enroll(c2);
        s1.enroll(c3);

        s2.enroll(c4);
        s2.enroll(c3);
        s2.enroll(c5);

        s3.enroll(c2);
        s3.enroll(c1);

        s1.printEnrolledCourses();
        s2.printEnrolledCourses();
        s3.printEnrolledCourses();
    }
}
