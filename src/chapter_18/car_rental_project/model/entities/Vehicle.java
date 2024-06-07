package chapter_18.car_rental_project.model.entities;

public class Vehicle {
    private String model;

    //************************************************************************
    // CONSTRUTORS
    //************************************************************************
    public Vehicle(){

    }

    public Vehicle(String model) {
        this.model = model;
    }

    //************************************************************************
    // GETTERS AND SETTERS
    //************************************************************************
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    //************************************************************************
    // METHODS
    //************************************************************************
}
