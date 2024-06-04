package chapter_14.lesson_166_exercise.application;

import chapter_14.lesson_166_exercise.entities.LegalPerson;
import chapter_14.lesson_166_exercise.entities.NaturalPerson;
import chapter_14.lesson_166_exercise.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char personType = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Anual Income: ");
            double anualIncome = scanner.nextDouble();
            scanner.nextLine();

            if(personType == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenses = scanner.nextDouble();
                scanner.nextLine();

                Person person = new NaturalPerson(name, anualIncome, healthExpenses);
                people.add(person);
            }
            else if(personType == 'c'){
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                scanner.nextLine();

                Person person = new LegalPerson(name, anualIncome, numberOfEmployees);
                people.add(person);
            }
            else {
                System.out.println("Invalid person type, please chose between (i/c)");
                break;
            }
        }

        double totalTaxes = 0.0;

        System.out.println("\nTAXES PAID");
        for (Person person : people){
            System.out.printf("%s: $%.2f%n", person.getName(), person.calculateTax());
        }

        for (Person person : people){
            totalTaxes += person.calculateTax();
        }
        System.out.printf("\nTOTAL TAXES: $%.2f%n", totalTaxes);

        scanner.close();
    }
}
