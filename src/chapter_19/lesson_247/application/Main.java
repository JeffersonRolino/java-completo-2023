package chapter_19.lesson_247.application;

import chapter_19.lesson_247.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter file full path: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){

            Set<LogEntry> logs = new HashSet<>();

            String line = bufferedReader.readLine();

            while (line != null){
                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                logs.add(new LogEntry(username, moment));

                line = bufferedReader.readLine();
            }

            System.out.println("Total users: " + logs.size());

        } catch (IOException exception){
            System.out.println("Error: " + exception.getMessage());
        }
        scanner.close();
    }
}
