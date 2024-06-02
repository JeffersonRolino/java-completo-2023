package chapter_14.lesson_158.application;

import chapter_14.lesson_158.entities.Account;
import chapter_14.lesson_158.entities.BusinessAccount;
import chapter_14.lesson_158.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(1001, "Peter Parker", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "Mary Jane", 0.0, 500.0);

        //*******************************************************
        // UPCASTING - Subclass to Superclass
        //*******************************************************
        Account account1 = businessAccount;
        System.out.println(account1);

        Account account2 = new BusinessAccount(1003, "Tony Stark", 0.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Steve Rogers", 0.0, 0.01);


        //*******************************************************
        // DOWNCASTING - Superclass to Subclass
        //*******************************************************
        BusinessAccount businessAccount1 = (BusinessAccount)account2;
        businessAccount1.loan(100.0);



        if(account3 instanceof BusinessAccount){
            BusinessAccount businessAccount2 = (BusinessAccount)account3;
            businessAccount2.loan(200.0);
            System.out.println("Loan!");
        }

        if(account3 instanceof SavingsAccount){
            SavingsAccount savingsAccount = (SavingsAccount) account3;
            savingsAccount.updateBalance();
            System.out.println("Update!");
        }
    }
}
