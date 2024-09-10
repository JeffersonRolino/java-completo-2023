package chapter_20.lesson_257.util;

import chapter_20.lesson_257.entities.Product;

import java.util.function.Consumer;

public class PriceUpdate implements Consumer<Product> {

    /**
     * Increase the price of the product in 10%
     * @param product the input argument
     */
    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }
}
