package chapter_05.lesson_36_exercises;

import java.util.Scanner;

/**
 * Exercício 01
 * Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
 */
public class Exercise_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;

        System.out.print("Insira um número inteiro: ");
        number = sc.nextInt();

        if(number > 0){
            System.out.printf("O número %d é positivo", number);
        }
        else if(number < 0) {
            System.out.printf("O número %d é negativo", number);
        }
        else {
            System.out.printf("O número %d é um número neutro...", number);
        }

        sc.close();
    }


}
