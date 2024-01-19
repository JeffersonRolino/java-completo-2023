package chapter_04.lesson_28_exercises;

import java.util.Scanner;

/**
 * Exercício 01
 * Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
 * mensagem explicativa, conforme exemplos.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int x = sc.nextInt();

        System.out.print("Digite outro número inteiro: ");
        int y = sc.nextInt();

        int soma = x + y;

        System.out.printf("SOMA = %d%n", soma);

        sc.close();
    }
}
