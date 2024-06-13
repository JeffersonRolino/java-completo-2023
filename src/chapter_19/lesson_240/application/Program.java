package chapter_19.lesson_240.application;

import chapter_19.lesson_240.entities.Product;
import chapter_19.lesson_240.services.CalculationService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        String path = "C:\\temp\\products.txt";

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {

            String line = bufferedReader.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = bufferedReader.readLine();
            }

            Product product = CalculationService.max(list);
            System.out.println("Most Expensive:");
            System.out.println(product);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}