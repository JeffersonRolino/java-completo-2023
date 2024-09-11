package chapter_20.lesson_259.application;

import chapter_20.lesson_259.entities.Product;
import chapter_20.lesson_259.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> products = new ArrayList<>();

        products.add(new Product("Tv", 900.00));
        products.add(new Product("Mouse", 50.00));
        products.add(new Product("Tablet", 350.50));
        products.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();

        double sum = productService.filteredSum(products, p -> p.getPrice() < 100.0);

        System.out.println("Sum = " + String.format("%.2f", sum));
    }
}
