package chapter_19.lesson_248.entities;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Course {
    private String name;
    private Set<Integer> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Integer> getStudents() {
        return students;
    }

    public void addStudent(Integer student){
        this.students.add(student);
    }

    public void addMultipleStudents(Scanner scanner){
        System.out.print("How many students for course " + this.name + "? ");
        int numberOfStudentsOnCourseA = scanner.nextInt();
        scanner.nextLine();

        int counter = 0;
        while(counter < numberOfStudentsOnCourseA){
            int student = scanner.nextInt();
            scanner.nextLine();

            this.students.add(student);
            counter++;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return name.equals(course.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
