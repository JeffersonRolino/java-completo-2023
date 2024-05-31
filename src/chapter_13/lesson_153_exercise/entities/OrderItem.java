package chapter_13.lesson_153_exercise.entities;

public class OrderItem {
    private int quantity;
    private Double price;
    private Product product;


    //**********************************************************************
    // CONSTRUCTORS
    //**********************************************************************
    public OrderItem() {
    }

    public OrderItem(int quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    //**********************************************************************
    // GETTERS AND SETTERS
    //**********************************************************************
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    //**********************************************************************
    // METHODS
    //**********************************************************************
    public Double subTotal(){
        return this.quantity * this.price;
    }


    //**********************************************************************
    // TO STRING
    //**********************************************************************
    @Override
    public String toString(){
        return product.getName() + ", " + "$" + String.format("%.2f", product.getPrice()) + ", " + "Quantity: " + quantity + ", " + "Subtotal: " + "$" + String.format("%.2f", this.subTotal());
    }

}
