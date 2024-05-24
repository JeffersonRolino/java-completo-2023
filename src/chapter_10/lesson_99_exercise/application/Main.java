package chapter_10.lesson_99_exercise.application;

import chapter_10.lesson_99_exercise.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("How many employees will be registered? ");
        int numberOfEmployeesToBeRegistered = scanner.nextInt();
        scanner.nextLine();

        System.out.print("\n");

        for (int i = 0; i < numberOfEmployeesToBeRegistered; i++) {
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            int id = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Salary: ");
            Double salary = scanner.nextDouble();

            employees.add(new Employee(id, name, salary));

            System.out.print("\n");
        }

        System.out.println("Enter the employee id that will have salary increase: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        Employee employeeToIncreaseSalary = employees.stream()
            .filter(employee -> employee.getId() == id)
            .findFirst()
            .orElse(null);

        if(employeeToIncreaseSalary != null){
            System.out.println("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            scanner.nextLine();

            employeeToIncreaseSalary.increaseSalary(percentage);
        }
        else {
            System.out.println("This id does not exist!");
        }

        System.out.println("\nList of employees: ");
        for (Employee employee : employees){
            System.out.println(employee);
        }

        scanner.close();
    }
}
