package chapter_15.lesson_178_exercise.application;

import chapter_15.lesson_178_exercise.model.entities.Account;
import chapter_15.lesson_178_exercise.model.exceptions.AccountException;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account data");
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Holder: ");
        String holder = scanner.nextLine();
        System.out.print("Initial balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Withdraw limit: ");
        double withdrawLimit = scanner.nextDouble();
        scanner.nextLine();

        Account account = new Account(number, holder, balance, withdrawLimit);

        try {
            System.out.print("\nEnter the amount for withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            scanner.nextLine();

            account.withdraw(withdrawAmount);
            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (AccountException exception){
            System.out.println("Withdraw error: " + exception.getMessage());
        }

        scanner.close();
    }
}
