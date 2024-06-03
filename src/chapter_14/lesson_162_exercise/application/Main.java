package chapter_14.lesson_162_exercise.application;

import chapter_14.lesson_162_exercise.entities.Employee;
import chapter_14.lesson_162_exercise.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();


        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Hours: ");
            int hours = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            scanner.nextLine();

            if(ch == 'y'){
                System.out.print("Additional charge: ");
                double additionalCharge = scanner.nextDouble();
                scanner.nextLine();

                employees.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            }
            else {
                employees.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for(Employee employee : employees){
            System.out.println(employee.getName() + " - $" + String.format("%.2f", employee.payment()));
        }


        scanner.close();
    }
}
