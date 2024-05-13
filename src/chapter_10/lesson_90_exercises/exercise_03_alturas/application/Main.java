package chapter_10.lesson_90_exercises.exercise_03_alturas.application;

import chapter_10.lesson_90_exercises.exercise_03_alturas.entities.Person;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas serao digitadas?");
        int number_of_people = scanner.nextInt();
        scanner.nextLine();

        Person[] people = new Person[number_of_people];

        for (int i = 0; i < people.length; i++) {
            System.out.println("********************************************");
            System.out.println("Dados da " + (i + 1) + "a pessoa");
            System.out.println("********************************************");

            System.out.println("Digite o nome desta pessoa: ");
            String name = scanner.nextLine();

            System.out.println("Digite a idade desta pessoa: ");
            int age = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite a altura desta pessoa: ");
            double height = scanner.nextDouble();
            scanner.nextLine();

            people[i] = new Person(name, age, height);
        }

        double sum = 0.0;

        int numberOfPeopleUnderAge = 0;

        for (Person person : people){
            sum += person.getHeight();

            if(person.getAge() < 16){
                numberOfPeopleUnderAge += 1;
            }
        }

        double averageHeight = sum / number_of_people;

        System.out.printf("\nAltura média: %.2f%n", averageHeight);

        double percentageOfPeopleUnder16 = (numberOfPeopleUnderAge * 100.0) / number_of_people;

        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentageOfPeopleUnder16);

        for (Person person: people){
            if(person.getAge() < 16){
                System.out.println(person.getName());
            }
        }

        scanner.close();
    }
}
