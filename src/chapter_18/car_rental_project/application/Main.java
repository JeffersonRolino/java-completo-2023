package chapter_18.car_rental_project.application;

import chapter_18.car_rental_project.model.entities.CarRental;
import chapter_18.car_rental_project.model.entities.Vehicle;
import chapter_18.car_rental_project.model.services.BrazilTaxService;
import chapter_18.car_rental_project.model.services.RentalService;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String carModel = scanner.nextLine();
        Vehicle vehicle = new Vehicle(carModel);

        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime startDate = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDateTime returnDate = LocalDateTime.parse(scanner.nextLine(), dateTimeFormatter);

        CarRental carRental = new CarRental(startDate, returnDate, vehicle);

        System.out.print("Entre com o preço por hora: ");
        Double pricePerHour = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Entre com o preço por dia: ");
        Double pricePerDay = scanner.nextDouble();
        scanner.nextLine();


        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(carRental);

        System.out.println("\nFATURA: ");
        System.out.printf("Pagamento basico: $%.2f%n", carRental.getInvoice().getBasicPayment());
        System.out.printf("Imposto:  $%.2f%n", carRental.getInvoice().getTax());
        System.out.printf("Pagamento total:  $%.2f%n", carRental.getInvoice().getTotalPayment());

        scanner.close();
    }
}
