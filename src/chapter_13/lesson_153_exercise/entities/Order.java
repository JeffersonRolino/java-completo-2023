package chapter_13.lesson_153_exercise.entities;

import chapter_13.lesson_153_exercise.entities.enums.OrderStatus;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

    //**********************************************************************
    // CONSTRUCTORS
    //**********************************************************************
    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    //**********************************************************************
    // GETTERS AND SETTERS
    //**********************************************************************
    public LocalDateTime getMoment() {
        return moment;
    }

    public void setMoment(LocalDateTime moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }


    //**********************************************************************
    // METHODS
    //**********************************************************************
    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }

    public double total(){
        double sum = 0;
        for (OrderItem item : this.items) {
            Double subTotal = item.subTotal();
             sum += subTotal;
        }
        return sum;
    }


    //**********************************************************************
    // TO STRING
    //**********************************************************************
    @Override
    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n").append("ORDER SUMMARY:").append("\n");
        stringBuilder.append("Order moment: ").append(moment.format(dateTimeFormatter)).append("\n")
                .append("Order status: ").append(status).append("\n")
                .append(client.toString()).append("\n");
        for (OrderItem item : items){
            stringBuilder.append(item.toString()).append("\n");
        }
        stringBuilder.append("Total price: ").append(" $").append(String.format("%.2f", total()));

        return stringBuilder.toString();
    }

}
