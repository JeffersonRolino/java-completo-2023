package chapter_06.lesson_44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número inteiro: ");
        int x = scanner.nextInt();

        int soma = 0;
        while(x != 0){
            soma += x;
            System.out.println("Insira um número inteiro: ");
            x = scanner.nextInt();
        }

        System.out.println("A Soma total é: " + soma);
        scanner.close();
    }
}
