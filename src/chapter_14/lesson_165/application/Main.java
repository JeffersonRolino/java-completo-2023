package chapter_14.lesson_165.application;

import chapter_14.lesson_165.entities.Circle;
import chapter_14.lesson_165.entities.Rectangle;
import chapter_14.lesson_165.entities.Shape;
import chapter_14.lesson_165.entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<Shape> shapes = new ArrayList<>();

        for(int i=1; i<=n; i++){
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeType = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(scanner.next());

            if(shapeType == 'r'){
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("Height: ");
                double height = scanner.nextDouble();
                scanner.nextLine();

                Shape rectangle = new Rectangle(color, width, height);
                shapes.add(rectangle);
            }
            else if(shapeType == 'c') {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                scanner.nextLine();

                Shape circle = new Circle(color, radius);
                shapes.add(circle);
            }
            else {
                System.out.println("Shape type invalid...");
                break;
            }
        }

        System.out.println("\nSHAPE AREAS: ");
        for(Shape shape : shapes){
            System.out.printf("%.2f%n", shape.area());
        }

        scanner.close();
    }
}
