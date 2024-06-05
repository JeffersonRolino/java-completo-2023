package chapter_15.lesson_172.application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        method1();

        System.out.println("End of Program...");
    }

    public static void method1(){
        System.out.println("\n*** METHOD 1 START ***");
        method2();
        System.out.println("*** METHOD 1 END ***\n");
    }

    public static void method2(){
        System.out.println("\n*** METHOD 2 START ***");
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[] {"Alex", "Maria", "Bob"};
        try {
            System.out.print("\tInsira a posição que deseja consultar: ");
            int position = scanner.nextInt();
            scanner.nextLine();
            System.out.println("\tNome: " + names[position]);
        } catch (InputMismatchException exception){
            System.out.println("\tERRO - A posição dever ser um número, ex: 1, 2, 3");
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("\tERRO - O array nomes só possui " + names.length + " nomes.");
            exception.printStackTrace();
            scanner.next();
        }
        scanner.close();
        System.out.println("*** METHOD 2 END ***\n");
    }
}
