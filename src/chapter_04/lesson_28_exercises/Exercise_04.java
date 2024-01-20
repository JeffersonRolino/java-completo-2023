package chapter_04.lesson_28_exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 04
 * Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
 * hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
 * decimais.
 */
public class Exercise_04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o número do funcionário: ");
        String number = sc.next();

        System.out.print("Informe o número de horas trabalhadas: ");
        int hours = sc.nextInt();

        System.out.print("Informe o valor da hora do funcionário: ");
        double price = sc.nextDouble();

        double salary = hours * price;

        System.out.println();

        System.out.printf("NUMBER = %s%n", number);
        System.out.printf("SALARY = U$%.2f%n", salary);

        sc.close();
    }
}

