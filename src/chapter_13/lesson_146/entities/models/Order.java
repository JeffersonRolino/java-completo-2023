package chapter_13.lesson_146.entities.models;

import chapter_13.lesson_146.entities.enums.OrderStatus;

import java.time.Instant;

public class Order {
    private Integer id;
    private Instant moment;
    private OrderStatus status;

    public Order(){}

    public Order(Integer id, Instant moment, OrderStatus status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Instant getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
