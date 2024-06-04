package chapter_14.lesson_164.application;

import chapter_14.lesson_164.entities.Account;
import chapter_14.lesson_164.entities.BusinessAccount;
import chapter_14.lesson_164.entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Account acc1 = new Account(1001, "John Snow", 1000.0); --- 'Account' is abstract; cannot be instantiated
        Account acc2 = new SavingsAccount(1002, "Daenerys Targaryen", 1000.0, 0.01);
        Account acc3 = new BusinessAccount(1003, "Tyrion Lannister", 1000.0, 500.0);
        Account acc4 = new SavingsAccount(1004, "Ned Stark", 2500.0, 1000.0);
        Account acc5 = new BusinessAccount(1005, "Twyn Lannister", 10000.0, 5000.0);

        List<Account> accounts = new ArrayList<>();

        accounts.add(acc2);
        accounts.add(acc3);
        accounts.add(acc4);
        accounts.add(acc5);

        double sum = 0.0;

        for (Account account : accounts){
            sum += account.getBalance();
        }

        System.out.printf("Total Balance: %.2f%n%n", sum);

        for(Account account : accounts){
            account.deposit(10.0);
        }

        for(Account account : accounts){
            System.out.printf("Updated balance for account %d: %.2f%n", account.getNumber(), account.getBalance());
        }
    }
}
