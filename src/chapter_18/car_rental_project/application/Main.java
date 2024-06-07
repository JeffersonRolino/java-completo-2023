package chapter_18.car_rental_project.application;

import chapter_18.car_rental_project.model.entities.CarRental;
import chapter_18.car_rental_project.model.entities.Vehicle;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");


        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();
        Vehicle vehicle = new Vehicle(carModel);

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime startDate = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime returnDate = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(startDate, returnDate, vehicle);



        scanner.close();
    }
}
