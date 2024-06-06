package chapter_17.lesson_221_exercise.entities;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<OrderItem> items = new ArrayList<>();

    //********************************************************************
    // CONSTRUCTORS
    //********************************************************************
    public Order() {
    }

    public Order(List<OrderItem> items) {
        this.items = items;
    }

    //********************************************************************
    // GETTERS AND SETTERS
    //********************************************************************
    public List<OrderItem> getItems() {
        return items;
    }

    //********************************************************************
    // METHODS
    //********************************************************************
    public void addItem(OrderItem item){
        this.items.add(item);
    }

    public void removeItem(OrderItem item){
        this.items.remove(item);
    }
}
