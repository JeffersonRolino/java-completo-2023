package chapter_05.lesson_39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira abaixo o preço do produto:");
        double preco = scanner.nextDouble();
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

        System.out.println("O desconto é: "+ desconto);
        double precoFinal = preco - desconto;

        System.out.printf("O preço final é R$%.2f%n ", precoFinal);

        scanner.close();
    }
}
