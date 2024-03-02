package chapter_05.lesson_38;

import java.util.Scanner;

public class WithIFandELSEIF {
    public static void main(String[] args) {
        System.out.print("Insira um número de 1 a 7: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        String dia;
        if (x == 1) {
            dia = "domingo";
        } else if (x == 2) {
            dia = "segunda";
        } else if (x == 3) {
            dia = "terca";
        } else if (x == 4) {
            dia = "quarta";
        } else if (x == 5) {
            dia = "quinta";
        } else if (x == 6) {
            dia = "sexta";
        } else if (x == 7) {
            dia = "sabado";
        } else {
            dia = "valor inválido";
        }
        System.out.println("Dia da semana: " + dia);
        sc.close();
    }
}
