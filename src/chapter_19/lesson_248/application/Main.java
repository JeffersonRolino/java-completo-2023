package chapter_19.lesson_248.application;

import chapter_19.lesson_248.entities.Course;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Set<Integer> allStudents = new HashSet<>();
        Course courseA = new Course("A");
        Course courseB = new Course("B");
        Course courseC = new Course("C");

        courseA.addMultipleStudents(scanner);
        courseB.addMultipleStudents(scanner);
        courseC.addMultipleStudents(scanner);

        allStudents.addAll(courseA.getStudents());
        allStudents.addAll(courseB.getStudents());
        allStudents.addAll(courseC.getStudents());

        System.out.println("Total Students: " + allStudents.size());

        scanner.close();
    }
}
