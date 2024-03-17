package chapter_08.lesson_70;

import chapter_08.lesson_70.utils.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Solution02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference = calc.circumference(radius);

        double volume = calc.volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", calc.PI);

        scanner.close();
    }
}
