package chapter_07.lesson_60;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int result = max(a,b, c);

        showResult(result);

        scanner.close();
    }

    public static int max(int a, int b, int c){
        if(a > b && a > c){
            return a;
        }
        else if(b > c){
            return b;
        }
        else {
            return c;
        }
    }

    public static void showResult(int number){
        System.out.println("Higher = " + number);
    }

}
