package chapter_14.lesson_163_exercise.application;

import chapter_14.lesson_163_exercise.entities.ImportedProduct;
import chapter_14.lesson_163_exercise.entities.Product;
import chapter_14.lesson_163_exercise.entities.UsedProduct;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Product> products = new ArrayList<>();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char t = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            if(t == 'c'){
                Product product = new Product(name, price);
                products.add(product);
            }
            else if (t == 'i') {
                System.out.print("Customs fee: ");
                double customsFee = scanner.nextDouble();
                scanner.nextLine();

                Product product = new ImportedProduct(name, price, customsFee);
                products.add(product);
            }
            else {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String inputDate = scanner.nextLine();
                LocalDate date = LocalDate.parse(inputDate, dateTimeFormatter);

                Product product = new UsedProduct(name, price, date);
                products.add(product);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products){
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}
