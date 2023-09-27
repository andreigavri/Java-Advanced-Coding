package ro.sda._2_collections._2_hashmap;

/*
Create a class called "Student" with the following properties: name, age, and major.
Include getters and setters for each property.

Create a class called "Course" with the following properties: name, instructor, and capacity.
Include getters and setters for each property.

Create a class called "University" with the following properties: name and a HashMap that maps a
Course object to a list of Student objects. Include getters and setters for each property, as well as a method called
"registerStudent" that takes in a Student object and a Course object, and adds the Student to the list of students for that course.
The method should return true if the registration was successful (i.e. the course is not full), and false otherwise.

Create a class called "Main" that creates a University object and several Student and Course objects.
Register some students for courses and print out the contents of the University's HashMap to verify that the registration was successful.

 */

public class Main {
    public static void main(String[] args) {

        University university = new University("UnitBv");
        Student s1 = new Student("Anca", 29);
        Student s2 = new Student("Ovidiu", 30);
        Student s3 = new Student("Ana", 22);
        Student s4 = new Student("Maria", 25);
        Student s5 = new Student("Miguel ", 21);
        Course java = new Course("Java", "Catalin", 3);
        Course math = new Course("Math", "Florin", 2);
        Course science = new Course("Science", "Manuel", 3);

        university.registerStudent(java, s1);
        university.registerStudent(java, s2);
        university.registerStudent(java, s4);
        university.registerStudent(java, s3);
        university.registerStudent(math, s1);
        university.registerStudent(math, s5);
        university.registerStudent(math, s2);
        university.registerStudent(math, s2);
        university.registerStudent(science, s2);
        university.registerStudent(science, s1);
        university.getCourseMap().forEach(
                (course, students) -> System.out.println("Denumire curs: " + course.getName() + "  Nume studenti" + students.toString()));

    }
}
