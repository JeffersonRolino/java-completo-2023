package chapter_13.lesson_153_exercise.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Client {
    private String name;
    private final String email;
    private final LocalDate birthDate;
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    //**********************************************************************
    // CONSTRUCTORS
    //**********************************************************************
    public Client(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }


    //**********************************************************************
    // GETTERS AND SETTERS
    //**********************************************************************
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    //**********************************************************************
    // TO STRING
    //**********************************************************************

    @Override
    public String toString() {
        return "Client: " + name + " (" + birthDate.format(dateTimeFormatter) + ")" + " - " + email;
    }
}
