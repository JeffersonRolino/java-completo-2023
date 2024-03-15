package chapter_08.lesson_64;

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

        x.p = (x.a + x.b + x.c) / 2.0;
        x.area = Math.sqrt(x.p * (x.p - x.a) * (x.p - x.b) * (x.p - x.c));

        y.p = (y.a + y.b + y.c) / 2.0;
        y.area = Math.sqrt(y.p * (y.p - y.a) * (y.p - y.b) * (y.p - y.c));

        if (x.area > y.area){
            System.out.printf("\nTriangle x has the larger area: %.2f%n", x.area);
        }
        else {
            System.out.printf("\nTriangle y has the larger area: %.2f%n", y.area);
        }

        scanner.close();
    }
}
