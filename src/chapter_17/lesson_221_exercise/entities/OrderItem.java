package chapter_17.lesson_221_exercise.entities;

public class OrderItem {
    private Product product;
    private int quantity;

    //********************************************************************
    // CONSTRUCTORS
    //********************************************************************
    public OrderItem() {
    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    //********************************************************************
    // GETTERS AND SETTERS
    //********************************************************************
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    //********************************************************************
    // METHODS
    //********************************************************************
    public String summarize(){
        double totalPrice = this.quantity * this.product.getPrice();
        return this.product.getName() + "," + String.format("%.2f", totalPrice);
    }

    //********************************************************************
    // TO STRING
    //********************************************************************
    @Override
    public String toString(){
        return this.product + "," + this.quantity;
    }
}
