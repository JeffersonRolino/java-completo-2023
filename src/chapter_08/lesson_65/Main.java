package chapter_08.lesson_65;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.getArea();

        double areaY = y.getArea();

        if (areaX > areaY){
            System.out.printf("\nTriangle x has the larger area: %.2f%n", areaX);
        }
        else {
            System.out.printf("\nTriangle y has the larger area: %.2f%n", areaY);
        }

        scanner.close();
    }
}
