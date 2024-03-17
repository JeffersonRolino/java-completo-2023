package chapter_08.lesson_69.exercise_02;

import chapter_08.lesson_69.exercise_02.entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Employee employee = new Employee();
        employee.name = "João Silva";
        employee.grossSalary = 6000.00;
        employee.tax = 1000.00;

        System.out.println(employee);

        System.out.println("Which percentage to increase salary?");
        double percentage = scanner.nextDouble();

        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);

        scanner.close();
    }
}
