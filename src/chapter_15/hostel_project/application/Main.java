package chapter_15.hostel_project.application;

import chapter_15.hostel_project.model.entities.Reservation;
import chapter_15.hostel_project.model.exceptions.DomainException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {
            System.out.print("Room number: ");
            int roomNumber = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Check-in date (dd/MM/yyyy): ");
            LocalDate checkInDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            LocalDate checkOutDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);


            Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOutDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

            reservation.updateDates(checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);
        }
        catch (DomainException exception){
            System.out.println("Error in reservation: " + exception.getMessage());
        }
        catch (InputMismatchException exception){
            System.out.println("Error in reservation: The room number must be a number");
        }
        catch (Exception exception){
            System.out.println("Unexpected error!");
        }

        System.out.println("\nGodbye!");

        scanner.close();
    }
}
