package chapter_20.lesson_253.application;

import chapter_20.lesson_253.entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("Armário", 500.00));
        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Balcão", 235.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Abajur", 120.00));

        // Sort using the interface Comparator
//        list.sort(new ProductComparator());

        // Sort using anonymous class
//        Comparator<Product> comparator = new Comparator<Product>() {
//            @Override
//            public int compare(Product product1, Product product2) {
//                return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
//            }
//        };

        // Sort using anomymous function (arrow function)
//        Comparator<Product> productComparator = (p1, p2) -> {
//            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
//        };

        // Sort using lambda
//        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));


        // Sort using comparing
//        Comparator<Product> productComparator = Comparator.comparing(p -> p.getName().toUpperCase());
//
//        list.sort(productComparator);

        list.sort(Comparator.comparing(p -> p.getName().toUpperCase()));

        for (Product p : list) {
            System.out.println(p);
        }
    }
}
