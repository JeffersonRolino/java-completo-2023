package chapter_20.lesson_257.entities;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product product){
        return product.getPrice() >= 100.0;
    }

    public boolean nonStaticProductPredicate(){
        return this.getPrice() >= 100.0;
    }

    public static void staticPriceUpdate(Product product){
        product.setPrice(product.getPrice() * 1.1);
    }

    public void nonStaticPriceUpdate(){
        this.setPrice(this.getPrice() * 1.1);
    }

    @Override
    public String toString() {
        return String.format("%s, R$%.2f", name, price);
    }
}
