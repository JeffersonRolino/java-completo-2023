package chapter_05.lesson_36_exercises;

import java.util.Scanner;

/**
 * Exercício 02
 * Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
 */
public class Exercise_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Insira um número inteiro: ");
        number = sc.nextInt();

        if(number % 2 == 0){
            System.out.printf("O número %d é par", number);
        }
        else {
            System.out.printf("O número %d é ímpar", number);
        }

        sc.close();
    }
}
