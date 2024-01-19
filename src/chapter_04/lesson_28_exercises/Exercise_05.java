package chapter_04.lesson_28_exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 05
 * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
 * código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
 */
public class Exercise_05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o código da Peça 1: ");
        double codigo1 = sc.nextDouble();

        System.out.print("Insira o número de peças 1 no pedido: ");
        double quantidade1 = sc.nextDouble();

        System.out.print("Insira o valor da Peça 1: ");
        double valor1 = sc.nextDouble();

        System.out.print("Insira o código da Peça 2: ");
        double codigo2 = sc.nextDouble();

        System.out.print("Insira o número de peças 2 no pedido: ");
        double quantidade2 = sc.nextDouble();

        System.out.print("Insira o valor da Peça 2: ");
        double valor2 = sc.nextDouble();

        double totalPeca1 = quantidade1 * valor1;
        double totalPeca2 = quantidade2 * valor2;
        double totalPedido = totalPeca1 + totalPeca2;

        System.out.printf("VALOR A PAGAR: R$%.2f%n", totalPedido);
    }
}
