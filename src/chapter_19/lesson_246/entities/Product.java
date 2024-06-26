package chapter_19.lesson_246.entities;

public class Product implements Comparable<Product> {
    private String name;
    private Double price;

    //*******************************************************************
    // CONSTRUCTORS
    //*******************************************************************
    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    //*******************************************************************
    // GETTERS AND SETTERS
    //*******************************************************************
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

    //*******************************************************************
    // HASHCODE EQUALS
    //*******************************************************************
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!name.equals(product.name)) return false;
        return price.equals(product.price);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + price.hashCode();
        return result;
    }

    //*******************************************************************
    // TO STRING
    //*******************************************************************
    @Override
    public String toString() {
        return name + ", " + price;
    }

    @Override
    public int compareTo(Product other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
