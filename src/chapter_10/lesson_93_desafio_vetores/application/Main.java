package chapter_10.lesson_93_desafio_vetores.application;

import chapter_10.lesson_93_desafio_vetores.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Student[] rooms = new Student[9];

        System.out.println("How many rooms will be rented? (Choose between 1 and 10");
        int quantityOfRoomsToBeRented = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < quantityOfRoomsToBeRented; i++) {
            System.out.println("Rent #" + (i + 1));
            System.out.println("What is the student's name: ");
            String name = scanner.nextLine();
            System.out.println("What is the student's email: ");
            String email = scanner.nextLine();
            System.out.println("Which room would you like to rent? (Choose between 1 and 10");
            int room = scanner.nextInt();
            scanner.nextLine();

            rooms[room] = new Student(name, email);
        }

        System.out.println("\nBusy rooms:");
        for (int i = 0; i < rooms.length; i++) {
            if(rooms[i] != null){
                System.out.println(i + ": " + rooms[i].getName() + ", " + rooms[i].getEmail());
            }
        }

        scanner.close();
    }
}
