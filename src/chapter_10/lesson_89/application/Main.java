package chapter_10.lesson_89.application;

import chapter_10.lesson_89.entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de entradas desejadas: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < products.length; i++) {
            System.out.println("Digite o nome do produto: ");
            String name = scanner.nextLine();

            System.out.println("Digite o preço do produto: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            products[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (Product product : products) {
            sum += product.getPrice();
        }

        double average = sum / n;

        System.out.printf("Average price = R$%.2f reais%n", average);

        scanner.close();
    }
}
