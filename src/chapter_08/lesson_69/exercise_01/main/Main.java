package chapter_08.lesson_69.exercise_01.main;

import chapter_08.lesson_69.exercise_01.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();


        System.out.println("Please inform the Width of the Rectangle: ");
        rectangle.width = scanner.nextDouble();

        System.out.println("Please inform the Height of the Rectangle: ");
        rectangle.height = scanner.nextDouble();

        System.out.printf("\nAREA = %.2f", rectangle.area());
        System.out.printf("\nPERIMETER = %.2f", rectangle.perimeter());
        System.out.printf("\nDIAGONAL = %.2f", rectangle.diagonal());

        scanner.close();

    }
}
