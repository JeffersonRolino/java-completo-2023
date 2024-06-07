package chapter_18.car_rental_project.model.entities;

public class Invoice {
    private Double basicPayment;
    private Double tax;

    //************************************************************************
    // CONSTRUTORS
    //************************************************************************
    public Invoice(){

    }

    public Invoice(Double basicPayment, Double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    //************************************************************************
    // GETTERS AND SETTERS
    //************************************************************************
    public Double getBasicPayment() {
        return basicPayment;
    }

    public void setBasicPayment(Double basicPayment) {
        this.basicPayment = basicPayment;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }

    //************************************************************************
    // METHODS
    //************************************************************************
    public Double getTotalPayment(){
        return getBasicPayment() - getTax();
    }

}
