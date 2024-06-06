package chapter_17.lesson_221_exercise.application;

import chapter_17.lesson_221_exercise.entities.Order;
import chapter_17.lesson_221_exercise.entities.OrderItem;
import chapter_17.lesson_221_exercise.entities.Product;

import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String path = "c:\\temp\\items";

        Order order = new Order();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path + "\\products.csv"))){
            String line = bufferedReader.readLine();

            while (line != null){
                String[] orderItems = line.split(",");

                String productName = orderItems[0];
                double productPrice = Double.parseDouble(orderItems[1]);

                Product product = new Product(productName, productPrice);

                int quantity = Integer.parseInt(orderItems[2]);

                OrderItem orderItem = new OrderItem(product, quantity);

                order.addItem(orderItem);

                line = bufferedReader.readLine();
            }

        }
        catch (IOException exception){
            throw new RuntimeException(exception);
        }

        boolean outputDirectoryWasCreated = new File(path + "\\out").mkdir();
        String outputPath = "";

        if (outputDirectoryWasCreated){
            outputPath = "c:\\temp\\items\\out";
        }

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath + "\\summary.csv"))){
            for(OrderItem orderItem : order.getItems()){
                bufferedWriter.write(orderItem.summarize());
                bufferedWriter.newLine();
            }
        }
        catch (IOException exception){
            throw new RuntimeException(exception);
        }

        for(OrderItem orderItem : order.getItems()){
            System.out.println(orderItem);
        }

    }
}
