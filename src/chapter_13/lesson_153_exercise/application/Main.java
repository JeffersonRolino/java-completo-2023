package chapter_13.lesson_153_exercise.application;

import chapter_13.lesson_153_exercise.entities.Client;
import chapter_13.lesson_153_exercise.entities.Order;
import chapter_13.lesson_153_exercise.entities.OrderItem;
import chapter_13.lesson_153_exercise.entities.Product;
import chapter_13.lesson_153_exercise.entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date: ");
        String inputBirthDate = scanner.nextLine();
        LocalDate birthDate = LocalDate.parse(inputBirthDate, dateTimeFormatter);

        Client client = new Client(name, email, birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String inputStatus = scanner.nextLine();
        OrderStatus status = OrderStatus.valueOf(inputStatus);
        System.out.print("How many items to this order? ");
        int numberOfItemsInThisOrder = scanner.nextInt();
        scanner.nextLine();

        Order order = new Order(LocalDateTime.now(), status, client);

        for (int i = 0; i < numberOfItemsInThisOrder; i++) {
            System.out.println("Enter #" + (i + 1) + " item data:");
            System.out.print("Product name: ");
            String productName = scanner.nextLine();
            System.out.print("Product Price: ");
            Double productPrice = scanner.nextDouble();
            System.out.print("Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);
        }

        System.out.println(order.toString());

        scanner.close();
    }
}
