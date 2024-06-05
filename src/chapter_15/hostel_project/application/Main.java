package chapter_15.hostel_project.application;

import chapter_15.hostel_project.model.entities.Reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Room number: ");
        int roomNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Check-in date (dd/MM/yyyy): ");
        LocalDate checkInDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
        System.out.print("Check-out date (dd/MM/yyyy): ");
        LocalDate checkOutDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

        if(!checkOutDate.isAfter(checkInDate)){
            System.out.println("Error in reservation: Check-out date must be after check-in date");
        }
        else {
            Reservation reservation = new Reservation(roomNumber, checkInDate, checkOutDate);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter data to update the reservation: ");
            System.out.print("Check-in date (dd/MM/yyyy): ");
            checkInDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);
            System.out.print("Check-out date (dd/MM/yyyy): ");
            checkOutDate = LocalDate.parse(scanner.nextLine(), dateTimeFormatter);

            LocalDate now = LocalDate.now();
            if(checkInDate.isBefore(now) || checkOutDate.isBefore(now)){
                System.out.println("Error in reservation: Reservation dates for update must be future dates");
            }
            else if(!checkOutDate.isAfter(checkInDate)){
                System.out.println("Error in reservation: Check-out date must be after check-in date");
            }
            else {
                reservation.updateDates(checkInDate, checkOutDate);
                System.out.println("Reservation: " + reservation);
            }
        }

        scanner.close();
    }
}
