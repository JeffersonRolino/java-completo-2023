package chapter_06.lesson_54;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        char resposta;
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double C = scanner.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
            System.out.print("Deseja repetir (s/n)?");
            resposta = scanner.next().charAt(0);
        } while(resposta != 'n');

        scanner.close();
    }
}
