package chapter_20.lesson_263_exercise.application;

import chapter_20.lesson_263_exercise.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = scanner.nextLine();

        System.out.println("Enter salary: ");
        Double salary = scanner.nextDouble();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            List<Employee> employees = new ArrayList<>();

            String line = bufferedReader.readLine();
            while (line != null){
                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
                line = bufferedReader.readLine();
            }

            List<String> emails = employees.stream()
                    .filter(e -> e.getSalary() > salary)
                    .map(Employee::getEmail)
                    .toList();

            System.out.printf("Email of people whose salary is more than R$%.2f.%n", salary);
            emails.forEach(System.out::println);

            Double sum = employees.stream()
                    .filter(e -> e.getName().charAt(0) == 'M')
                    .map(e -> e.getSalary())
                    .reduce(0.0, Double::sum);

            System.out.printf("Sum of salary of people whose name starts with 'M': R$%.2f", sum);
        }
        catch (IOException exception){
            System.out.println("Error: " + exception.getMessage());
        }
        scanner.close();
    }
}
