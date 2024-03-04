package chapter_06.lesson_43;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a largura do terreno em metros: ");
        double largura = sc.nextDouble();

        System.out.println("Insira o comprimento do terreno em metros: ");
        double comprimento = sc.nextDouble();

        System.out.println("Insira o valor do metro quadrado na região: ");
        double metroQuadrado = sc.nextDouble();

        double area = largura * comprimento;
        double preco = area * metroQuadrado;
        System.out.printf("AREA = %.2f%n", area);
        System.out.printf("PRECO = %.2f%n", preco);
        sc.close();
    }
}