package chapter_14.lesson_159.application;

import chapter_14.lesson_159.entities.Account;
import chapter_14.lesson_159.entities.BusinessAccount;
import chapter_14.lesson_159.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Peter Parker", 1000.0);
        account.withdraw(200.0);
        System.out.println(account.getBalance());

        Account account2 = new SavingsAccount(1002, "Mary Jane", 1000.0, 0.01);
        account2.withdraw(200.0);
        System.out.println(account2.getBalance());

        Account account3 = new BusinessAccount(1003, "Tony Stark", 1000.0, 500.0);
        account3.withdraw(200.0);
        System.out.println(account3.getBalance());
    }
}
