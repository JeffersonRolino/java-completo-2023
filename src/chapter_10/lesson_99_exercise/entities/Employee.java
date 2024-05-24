package chapter_10.lesson_99_exercise.entities;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    //***************************************************************
    // CONSTRUTORES
    //***************************************************************

    public Employee() {
    }

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }


    //***************************************************************
    // GETTERS & SETTERS
    //***************************************************************

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }


    //***************************************************************
    // METHODS
    //***************************************************************

    public void increaseSalary(Double percentage){
        this.salary += this.salary * (percentage / 100);
    }

    //***************************************************************
    // EQUALS & TOSTRING
    //***************************************************************


    @Override
    public String toString() {
        return String.format("%d, %s, %.2f", this.id, this.name, this.salary);
    }
}
