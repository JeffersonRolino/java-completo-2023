package chapter_10.lesson_88.application;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de entradas desejadas: ");
        int n = scanner.nextInt();
        double[] vect = new double[n];

        for(int i=0; i < n; i++){
            System.out.println("Digite a altura desejada:");
            vect[i] = scanner.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < n; i++) {
            sum += vect[i];
        }

        double average = sum / n;

        System.out.printf("Average Height: %.2f%n", average);

        scanner.close();
    }
}
