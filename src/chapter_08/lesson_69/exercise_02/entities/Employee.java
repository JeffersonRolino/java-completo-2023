package chapter_08.lesson_69.exercise_02.entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double percentage){
        grossSalary += (percentage * grossSalary) / 100;
    }

    @Override
    public String toString() {
        return String.format("Employee: %s, $%.2f%n", name, netSalary());
    }
}
