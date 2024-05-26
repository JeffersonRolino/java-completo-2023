package chapter_11.lesson_111.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        //********************************************************
        // Convertendo Data-Hora para Texto
        //********************************************************
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter dateTimeFormatter4 = DateTimeFormatter.ISO_INSTANT;

        // Três formas de chamar o DateTimeFormatter
        System.out.println("LocalDate = " + localDate.format(dateTimeFormatter));
        System.out.println("LocalDate = " + dateTimeFormatter.format(localDate));
        System.out.println("LocalDate = " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println();
        System.out.println("LocalDateTime = " + localDateTime.format(dateTimeFormatter1));

        System.out.println();
        System.out.println("Instant = " + dateTimeFormatter2.format(instant));

        System.out.println();
        System.out.println("LocalDateTime ISO_DATE_TIME = " + localDateTime.format(dateTimeFormatter3));
        System.out.println("LocalDateTime ISO_INSTANT = " + dateTimeFormatter4.format(instant));
    }
}
