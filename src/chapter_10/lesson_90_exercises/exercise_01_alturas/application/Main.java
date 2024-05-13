package chapter_10.lesson_90_exercises.exercise_01_alturas.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos números você vai digitar? (Máximo 10)");
        int quantity = scanner.nextInt();
        scanner.nextLine();

        int[] numbers = new int[quantity];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Digite um número inteiro: ");
            numbers[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\nNúmeros negativos: ");
        for (int number : numbers){
            if(number < 0){
                System.out.println(number);
            }
        }

        scanner.close();
    }
}
