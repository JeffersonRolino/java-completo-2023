package chapter_09.lesson_81_exercises.entities;

public class Holder {
    private String name;

    public Holder() {
    }

    public Holder(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
