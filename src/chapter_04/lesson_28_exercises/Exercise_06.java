package chapter_04.lesson_28_exercises;

import java.util.Locale;
import java.util.Scanner;

/**
 * Exercício 06
 * Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
 * mostre:
 * a) a área do triângulo retângulo que tem A por base e C por altura.
 * b) a área do círculo de raio C. (pi = 3.14159)
 * c) a área do trapézio que tem A e B por bases e C por altura.
 * d) a área do quadrado que tem lado B.
 * e) a área do retângulo que tem lados A e B
 */
public class Exercise_06 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Insira o primeiro valor: ");
        double A = sc.nextDouble();

        System.out.print("Insira o segundo valor: ");
        double B = sc.nextDouble();

        System.out.print("Insira o terceiro valor: ");
        double C = sc.nextDouble();

        double a = (A * C) / 2;
        double b = 3.14159 * Math.pow(C, 2);
        double c = ((A + B) * C) / 2;
        double d = B * B;
        double e = A * B;

        System.out.printf("TRIANGULO: %.3f%n", a);
        System.out.printf("CÍRCULO: %.3f%n", b);
        System.out.printf("TRAPÉZIO: %.3f%n", c);
        System.out.printf("QUADRADO: %.3f%n", d);
        System.out.printf("RETÂNGULO: %.3f%n", e);
    }
}
