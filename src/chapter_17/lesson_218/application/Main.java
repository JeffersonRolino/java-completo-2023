package chapter_17.lesson_218.application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String[] lines = new String[]{"Bruce Wayne", "Clark Kent", "Tony Stark", "Steve Rogers"};

        String path = "c:\\temp\\out.txt";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sucess!");
    }
}
