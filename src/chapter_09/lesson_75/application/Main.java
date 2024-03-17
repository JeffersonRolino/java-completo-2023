package chapter_09.lesson_75.application;

import chapter_09.lesson_75.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Price: ");
        double price = scanner.nextDouble();

        System.out.println("Quantity in Stock: ");
        int quantity = scanner.nextInt();

        Product product = new Product(name, price, quantity);

        System.out.println("\nProduct data: " + product);

        System.out.println("\nEnter the number of products to be added in stock: ");
        int quantityToAdd = scanner.nextInt();
        product.addProducts(quantityToAdd);

        System.out.println("\nUpdated data: " + product);

        System.out.println("\nEnter the number of products to be remove from stock: ");
        int quantityToRemove = scanner.nextInt();
        product.removeProducts(quantityToRemove);

        System.out.println("\nUpdated data: " + product);

        scanner.close();
    }
}
