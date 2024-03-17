package chapter_08.lesson_71;

import chapter_08.lesson_71.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Solution03 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference = Calculator.circumference(radius);

        double volume = Calculator.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", Calculator.PI);

        scanner.close();
    }
}
