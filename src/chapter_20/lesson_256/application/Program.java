package chapter_20.lesson_256.application;

import chapter_20.lesson_256.entities.Product;
import chapter_20.lesson_256.utils.ProductPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        /*
        * Existem múltiplas formas de atingir o mesmo resultado utilizando
        * predicados e expressões lambda. Segue abaixo cinco versões:
        */

        // Versão 1: Implementação da Interface
//        list.removeIf(new ProductPredicate());

        // Versão 2: Reference Method com método estático
//        list.removeIf(Product::staticProductPredicate);

        // Versão 3: Reference Method com método não estático
//        list.removeIf(Product::nonStaticProductPredicate);

        // Versão 4: Expressão lambda declarada
//        double min = 100.0;
//        Predicate<Product> productPredicate = p -> p.getPrice() >= min;
//        list.removeIf(productPredicate);

        // Versão 5: Expressão Lambda Inline
        list.removeIf(p -> p.getPrice() >= 100);


        for(Product p : list){
            System.out.println(p);
        }
    }
}
