package chapter_14.lesson_166_exercise.entities;

public abstract class Person {
    private String name;
    private Double annualIncome;


    //*********************************************************************
    // CONSTRUCTORS
    //*********************************************************************
    public Person() {
    }

    public Person(String name, Double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }


    //*********************************************************************
    // GETTERS AND SETTERS
    //*********************************************************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(Double annualIncome) {
        this.annualIncome = annualIncome;
    }


    //*********************************************************************
    // METHODS
    //*********************************************************************
    public abstract double calculateTax();
}
