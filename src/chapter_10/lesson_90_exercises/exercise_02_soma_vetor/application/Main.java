package chapter_10.lesson_90_exercises.exercise_02_soma_vetor.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar?");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        double[] numbers = new double[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um número real: ");
            numbers[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        double sum = 0.0;
        double average = 0.0;

        System.out.print("\nVALORES: ");
        for (double number : numbers){
            System.out.print(number + "  ");
        }

        System.out.println("\nSOMA: " + sum);
        System.out.println("MEDIA: " + average);

        scanner.close();
    }
}
