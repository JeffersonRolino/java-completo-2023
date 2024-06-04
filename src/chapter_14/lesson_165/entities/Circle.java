package chapter_14.lesson_165.entities;

import chapter_14.lesson_165.entities.enums.Color;

public class Circle extends Shape {
    private Double radius;


    //****************************************************************
    // CONSTRUCTORS
    //****************************************************************
    public Circle() {
    }

    public Circle(Color color, Double radius) {
        super(color);
        this.radius = radius;
    }


    //****************************************************************
    // GETTERS AND SETTERS
    //****************************************************************
    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }


    //****************************************************************
    // METHODS
    //****************************************************************
    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
