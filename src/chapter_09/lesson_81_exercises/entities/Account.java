package chapter_09.lesson_81_exercises.entities;

public class Account {
    private int number;
    private Holder holder;
    private double balance;
    private double tax = 5.0;

    public Account() {
    }

    public Account(int number, Holder holder) {
        this.number = number;
        this.holder = holder;
    }

    public Account(int number, Holder holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public int getNumber() {
        return number;
    }

    public Holder getHolder() {
        return holder;
    }

    public double getBalance() {
        return balance;
    }

    private void setHolder(Holder holder) {
        this.holder = holder;
    }

    private void setBalance(double balance) {
        this.balance = balance;
    }

    public double getTax() {
        return tax;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public void withdraw(double amount){
        this.balance -= amount + this.tax;
    }

    public void changeTax(double amount){
        this.tax = amount;
    }

    @Override
    public String toString() {
        return "Account " + number +
                ", Holder: " + holder +
                ", Balance: $" + String.format("%.2f", balance);
    }
}
