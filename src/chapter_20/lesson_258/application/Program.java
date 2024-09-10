package chapter_20.lesson_258.application;

import chapter_20.lesson_258.entities.Product;
import chapter_20.lesson_258.util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        //Versão 1: Implementação da Interface
//        List<String> names = list.stream().map(new UpperCaseName()).toList();

        //Versão 2: Reference Method com método estático
//        List<String> names = list.stream().map(Product::staticUpperCaseName).toList();

        //Versão 3: Reference Method com método não estático
//        List<String> names = list.stream().map(Product::nonStaticUpperCaseName).toList();

        //Versão 4: Expressão lambda declarada
//        Function<Product, String> productStringFunction = p -> p.getName().toUpperCase();
//        List<String> names = list.stream().map(productStringFunction).toList();

        //Versão 5: Expressão lambda inline
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).toList();

        names.forEach(System.out::println);
    }
}
