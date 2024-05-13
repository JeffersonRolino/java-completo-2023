package chapter_10.lesson_93_desafio_vetores.entities;

public class Student {
    String name;
    String email;

    public Student() {
    }

    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
