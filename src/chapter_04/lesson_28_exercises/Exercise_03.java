package chapter_04.lesson_28_exercises;

import java.util.Scanner;

/**
 * Exercício 03
 * Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
 * de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
 */
public class Exercise_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int A = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int B = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int C = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int D = sc.nextInt();

        int DIFERENCA = (A * B - C * D);

        System.out.printf("DIFERENÇA = %d%n", DIFERENCA);

        sc.close();
    }
}
