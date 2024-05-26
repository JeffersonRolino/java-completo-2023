package chapter_10.lesson_103_exercise.application;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insira o número de linhas: ");
        int numberOfRows = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Insira o número de colunas: ");
        int numberOfColumns = scanner.nextInt();
        scanner.nextLine();

        int[][] numbers = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print("Insira um número inteiro: ");
                numbers[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
        }

        System.out.print("\n***********************************");
        System.out.print("\nMatriz de Números");
        System.out.print("\n***********************************\n");
        for (int i = 0; i < numberOfRows; i++) {
            System.out.println(Arrays.toString(numbers[i]));
        }

        System.out.print("\nInsira o número que gostaria de buscar: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        checkNeighbours(numbers, number);

        scanner.close();
    }

    private static void checkNeighbours(int[][] matrix, int number){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if(number == matrix[i][j]){
                    System.out.println("O número buscado está na posição " + i + ":" + j);
                    if(j > 0){
                        System.out.println("Left: " + matrix[i][j - 1]);
                    }
                    if(i > 0){
                        System.out.println("Up: " + matrix[i - 1][j]);
                    }
                    if(j < matrix[i].length - 1){
                        System.out.println("Right: " + matrix[i][j + 1]);
                    }
                    if(i < matrix[i].length - 1){
                        System.out.println("Down: " + matrix[i + 1][j]);
                    }
                }
            }
        }
    }
}
