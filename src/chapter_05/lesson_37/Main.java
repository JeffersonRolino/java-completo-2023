package chapter_05.lesson_37;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double conta = 50.0;
        double precoPorMinuto = 2.0;

        System.out.println("Digite a quantidade de minutos consumidos: ");
        int minutos = scanner.nextInt();

        if(minutos > 100){
            conta += ((minutos - 100) * precoPorMinuto);
        }

        System.out.printf("Valor da conta = R$%.2f%n", conta);


        scanner.close();
    }
}
