package chapter_14.lesson_165.entities;

import chapter_14.lesson_165.entities.enums.Color;

public abstract class Shape {
    private Color color;


    //****************************************************************
    // CONSTRUCTORS
    //****************************************************************
    public Shape() {}

    public Shape(Color color) {
        this.color = color;
    }


    //****************************************************************
    // GETTERS AND SETTERS
    //****************************************************************
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    //****************************************************************
    // METHODS
    //****************************************************************
    public abstract double area();
}
