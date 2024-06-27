package chapter_19.lesson_250.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the file full path: ");
        String path = scanner.nextLine();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))){
            Map<String, Integer> voters = new HashMap<>();

            String line = bufferedReader.readLine();

            int totalVotes;

            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                Integer votes = Integer.parseInt(fields[1]);

                if(voters.containsKey(name)){
                     totalVotes = voters.get(name) + votes;
                     voters.put(name, totalVotes);
                }
                else {
                    totalVotes = 0;
                    voters.put(name, votes);
                }

                line = bufferedReader.readLine();
            }

            for (String key : voters.keySet()){
                System.out.println(key + ": " + voters.get(key));
            }
        }
        catch (IOException ioException){
            System.out.println("Error: " + ioException.getMessage());
        }

        scanner.close();
    }
}
