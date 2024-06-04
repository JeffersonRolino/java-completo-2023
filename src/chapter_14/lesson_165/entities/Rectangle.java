package chapter_14.lesson_165.entities;

import chapter_14.lesson_165.entities.enums.Color;

public class Rectangle extends Shape {

    private double width;
    private double height;


    //****************************************************************
    // CONSTRUCTORS
    //****************************************************************
    public Rectangle() {
        super();
    }

    public Rectangle(Color color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
    }


    //****************************************************************
    // GETTERS AND SETTERS
    //****************************************************************
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    //****************************************************************
    // METHODS
    //****************************************************************
    @Override
    public double area() {
        return this.width * this.height;
    }
}
