package chapter_09.lesson_81_exercises.application;

import chapter_09.lesson_81_exercises.entities.Account;
import chapter_09.lesson_81_exercises.entities.Holder;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder: ");
        Holder holder = new Holder();
        String holderName = scanner.nextLine();
        holder.setName(holderName);

        System.out.print("Is the an initial deposit (y/n)? ");
        char choice = scanner.next().charAt(0);

        double depositAmount;
        if (choice == 'y'){
            System.out.print("Enter initial deposit value: ");
            depositAmount = scanner.nextDouble();
        }
        else {
            depositAmount = 0.0;
        }

        Account account = new Account(accountNumber, holder, depositAmount);
        System.out.println("\nAccount data: ");
        System.out.println(account);

        System.out.print("\nEnter a deposit value: ");
        double amount = scanner.nextDouble();
        account.deposit(amount);
        System.out.println("Updated account data: ");
        System.out.println(account);

        System.out.print("\nEnter a withdraw value: ");
        amount = scanner.nextDouble();
        account.withdraw(amount);
        System.out.println("Updated account data: ");
        System.out.println(account);

        scanner.close();
    }
}
