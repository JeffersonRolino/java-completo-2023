package chapter_14.lesson_163_exercise.entities;

public class ImportedProduct extends Product {
    private Double customsFee;


    //*************************************************************************
    // CONSTRUCTORS
    //*************************************************************************
    public ImportedProduct() {}

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }


    //*************************************************************************
    // GETTERS AND SETTERS
    //*************************************************************************
    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }


    //*************************************************************************
    // METHODS
    //*************************************************************************
    @Override
    public String priceTag(){
        return this.getName() + " $" + String.format("%.2f", this.totalPrice())
                              + " (Custom fee: $" + String.format("%.2f", getCustomsFee())
                              + ")";
    }

    public double totalPrice(){
        return this.getPrice() + this.getCustomsFee();
    }
}
