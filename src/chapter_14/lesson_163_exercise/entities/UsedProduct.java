package chapter_14.lesson_163_exercise.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
    private LocalDate manufactureDate;

    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //*************************************************************************
    // CONSTRUCTORS
    //*************************************************************************
    public UsedProduct() {}

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }


    //*************************************************************************
    // GETTERS AND SETTERS
    //*************************************************************************
    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }


    //*************************************************************************
    // METHODS
    //*************************************************************************
    @Override
    public String priceTag(){
        return this.getName() + " $" + String.format("%.2f", this.getPrice())
                              + " (Manufacture date: " + this.getManufactureDate().format(dateTimeFormatter)
                              + ")";
    }
}
