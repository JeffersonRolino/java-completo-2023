package chapter_06.lesson_49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Insira a quantidade de números: ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Insira um número inteiro:");
            int number = scanner.nextInt();
            sum += number;
        }

        System.out.println("A soma total dos números é: " + sum);
        scanner.close();
    }
}
