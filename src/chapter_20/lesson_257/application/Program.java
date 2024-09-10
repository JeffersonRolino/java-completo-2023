package chapter_20.lesson_257.application;

import chapter_20.lesson_257.entities.Product;
import chapter_20.lesson_257.util.PriceUpdate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        // Versão 01: Implementação da interface
//        list.forEach(new PriceUpdate());

        // Versão 02: Reference Method com método estático
//        list.forEach(Product::staticPriceUpdate);

        // Versão 03: Reference Method com método não estático
//        list.forEach(Product::nonStaticPriceUpdate);

        // Versão 04: Expressão Lambda Declarada
//        double increaseRate = 1.2;
//        Consumer<Product> productConsumer = p -> p.setPrice(p.getPrice() * increaseRate);
//        list.forEach(productConsumer);

        // Versão 05: Expressão Lambda Inline
        list.forEach(p -> p.setPrice(p.getPrice() * 1.1));


        // Print list
        list.forEach(System.out::println);
    }
}
