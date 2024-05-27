package chapter_13.lesson_146.application;

import chapter_13.lesson_146.entities.enums.OrderStatus;
import chapter_13.lesson_146.entities.models.Order;

import java.time.Instant;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1080, Instant.now(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        // Instanciando Enum
        OrderStatus os1 = OrderStatus.DELIVERED;

        // Instanciando Enum from String
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");

        System.out.println("os1 = " + os1);
        System.out.println("os2 = " + os2);

    }
}
