package chapter_08.lesson_69.exercise_03.entities;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double getFinalGrade(){
        return grade1 + grade2 + grade3;
    }
}
