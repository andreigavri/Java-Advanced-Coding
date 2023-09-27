package ro.sda._2_collections._2_hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/*
Create a class called "University" with the following properties: name and a HashMap that maps a
Course object to a list of Student objects. Include getters and setters for each property, as well as a method called
"registerStudent" that takes in a Student object and a Course object, and adds the Student to the list of students for that course.
The method should return true if the registration was successful (i.e. the course is not full), and false otherwise.
 */
public class University {
    private String name;
    private HashMap<Course, List<Student>> courseMap;

    public University(String name) {
        this.name = name;
        this.courseMap = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public HashMap<Course, List<Student>> getCourseMap() {
        return courseMap;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean registerStudent(Course c, Student s) {

        if (courseMap.containsKey(c)) {
            List<Student> students = courseMap.get(c);
            if (students.size() <= c.getCapacity()) {
                students.add(s);
                return true;
            }
        } else {
            List<Student> students = new ArrayList<>();
            students.add(s);
            courseMap.put(c, students);
            return true;
        }
        return false;
    }
}