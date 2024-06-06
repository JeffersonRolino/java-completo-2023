package chapter_17.lesson_219.application;

import java.io.File;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String stringPath = scanner.nextLine();

        File path = new File(stringPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS: ");
        for (File folder : folders){
            System.out.println(folder);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("FILES: ");
        for(File file : files){
            System.out.println(file);
        }

        boolean sucess = new File(stringPath + "\\subdir").mkdir();
        System.out.println("Directory created successfully: " + sucess);

        scanner.close();
    }
}
