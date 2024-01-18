package chapter_04.lesson_25;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Entrada de Strings
/*        String x;
        System.out.print("Digite uma palavra: ");
        x = sc.next();
        System.out.println("Você digitou: " + x);*/

        // Entrada de Inteiros
/*        int x;
        System.out.print("Digite um número: ");
        x = sc.nextInt();
        System.out.println("Você digitou o número: " + x);*/

        // Entrada de Double
/*        double x;
        System.out.print("Digite um número: ");
        x = sc.nextDouble();
        System.out.println("Você digitou o número: " + x);*/

        // Entrada de Characters (Chars)
/*        char x;
        System.out.print("Digite seu gênero, (F)Feminino (M)Masculino: ");
        x = sc.next().charAt(0);
        System.out.println(x);*/

        // Entrada múltiplas
        String x;
        int y;
        double z;
        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        System.out.println("Dados digitados: ");
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        sc.close();
    }
}
