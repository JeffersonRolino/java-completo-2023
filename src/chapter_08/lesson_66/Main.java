package chapter_08.lesson_66;

import chapter_08.lesson_66.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);


        Product product = new Product();
        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        product.name = scanner.nextLine();

        System.out.println("Price: ");
        product.price = scanner.nextDouble();

        System.out.println("Quantity in Stock: ");
        product.quantity = scanner.nextInt();


        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        scanner.close();
    }
}
