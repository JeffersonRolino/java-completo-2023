package chapter_08.lesson_70;

import java.util.Locale;
import java.util.Scanner;

public class Solution01 {
    public static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter radius: ");
        double radius = scanner.nextDouble();

        double circumference = circumference(radius);

        double volume = volume(radius);

        System.out.printf("Circumference: %.2f%n", circumference);
        System.out.printf("Volume: %.2f%n", volume);
        System.out.printf("PI value: %.2f%n", PI);

        scanner.close();
    }

    public static double circumference(double radius){
        return 2 * PI * radius;
    }

    public static double volume(double radius){
        return 4.0 * PI * Math.pow(radius, 3) / 3.0;
    }
}
