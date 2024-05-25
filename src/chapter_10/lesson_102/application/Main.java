package chapter_10.lesson_102.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o tamanho da matrix: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Insira um número inteiro: ");
                matrix[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        System.out.println("A diagonal principal é: ");
        for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][i] + " ");
        }


        int quantidadeDeNumerosNegativos = 0;
        System.out.println("\nA quantidade de números negativos é: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(matrix[i][j] < 0){
                    quantidadeDeNumerosNegativos++;
                }
            }
        }
        System.out.println(quantidadeDeNumerosNegativos);

        scanner.close();
    }
}
