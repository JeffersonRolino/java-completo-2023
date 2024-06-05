package chapter_15.lesson_171.application;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[] {"Alex", "Maria", "Bob"};

        try {
            System.out.print("Insira a posição que deseja consultar: ");
            int position = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Nome: " + names[position]);
        } catch (InputMismatchException exception){
            System.out.println("ERRO - A posição dever ser um número, ex: 1, 2, 3");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("ERRO - O array nomes só possui " + names.length + " nomes.");
        }

        System.out.println("End of Program...");

        scanner.close();
    }
}
