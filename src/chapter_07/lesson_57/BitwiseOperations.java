package chapter_07.lesson_57;

import java.util.Scanner;

public class BitwiseOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n = scanner.nextInt();

        int mask = 0b100000;
        if((n & mask) != 0){
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        scanner.close();
    }
}
