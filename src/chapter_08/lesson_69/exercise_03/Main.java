package chapter_08.lesson_69.exercise_03;

import chapter_08.lesson_69.exercise_03.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();


        System.out.println("Type the Student name: ");
        student.name = scanner.nextLine();

        System.out.println("Enter the first grade: ");
        student.grade1 = scanner.nextDouble();

        System.out.println("Enter the second grade: ");
        student.grade2 = scanner.nextDouble();

        System.out.println("Enter the trird grade: ");
        student.grade3 = scanner.nextDouble();

        System.out.println();
        if(student.getFinalGrade() < 60.0){
            System.out.println("FINAL GRADE = " + student.getFinalGrade());
            System.out.println("FAILED");
            System.out.println("MISSING " + (60.0 - student.getFinalGrade()) + " POINTS");
        }
        else {
            System.out.println("FINAL GRADE = " + student.getFinalGrade());
            System.out.println("PASS");
        }

        scanner.close();
    }
}
