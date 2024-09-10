package chapter_20.lesson_257.entities;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product> {
    @Override
    public int compare(Product product1, Product product2) {
        return product1.getName().toUpperCase().compareTo(product2.getName().toUpperCase());
    }
}
