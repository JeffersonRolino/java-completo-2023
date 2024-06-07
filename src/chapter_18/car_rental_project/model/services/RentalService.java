package chapter_18.car_rental_project.model.services;

import chapter_18.car_rental_project.model.entities.CarRental;
import chapter_18.car_rental_project.model.entities.Invoice;

import java.time.Duration;

public class RentalService {
    private final Double pricePerHour;
    private final Double pricePerDay;
    private final TaxService taxService;

    //************************************************************************
    // CONSTRUTORS
    //************************************************************************
    public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }

    //************************************************************************
    // METHODS
    //************************************************************************
    public void processInvoice(CarRental carRental){
        double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if(hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        carRental.setInvoice(new Invoice(basicPayment, tax));
    }
}
