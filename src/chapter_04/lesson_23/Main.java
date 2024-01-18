package chapter_04.lesson_23;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int y = 32;
        System.out.println(y);

        double x = 10.355784;
        System.out.println(x);
        System.out.printf("%.2f%n", x);
        System.out.printf("%.4f%n", x);

        // Mudando "," para "." como indicador de centena e milhares
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n", x);

        // O print não possui quebra de linha...
        System.out.print("Olá mundo!");

        //Já o println sim!
        System.out.println(" Bom dia!");

        // Concatenando Strings com o "+"
        System.out.println("Resultado = " + x + " METROS");

        // Concatenando com o printf
        System.out.printf("RESULTADO = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000.0;
        System.out.printf("%s tem %d anos e ganha R$%.2f reais%n", nome, idade, renda);
    }
}
