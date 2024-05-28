package chapter_13.lesson_149.application;

import chapter_13.lesson_149.entities.Department;
import chapter_13.lesson_149.entities.HourContract;
import chapter_13.lesson_149.entities.Worker;
import chapter_13.lesson_149.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = scanner.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String workerName = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base Salary: ");
        double workerSalary = scanner.nextDouble();
        scanner.nextLine();

        Department department = new Department(departmentName);

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerSalary, department);

        System.out.println("How many contracts this worker have?");
        int numberOfContracts = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfContracts; i++) {
            System.out.println("Enter contract #" + (i + 1) + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            String date = scanner.next();
            LocalDate contractDate = LocalDate.parse(date, formatter);
            System.out.print("Value per hour: ");
            double valuePerHour = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Duration (hours): ");
            int hours = scanner.nextInt();
            scanner.nextLine();

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.print("Enter month and year to calculate income (MM/YYYY):");
        String monthAndYear = scanner.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment());
        System.out.println("Income for: " + month + "/" + year + ": " + String.format("%.2f", worker.income(year, month)));

        scanner.close();
    }
}
