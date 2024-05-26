package chapter_11.lesson_110.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        //********************************************************
        // Instanciando Data-Hora Local e Global
        //********************************************************
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println("Local Date = " + localDate);
        System.out.println("Local Date Time = " + localDateTime);
        System.out.println("Instant = " + instant);


        //********************************************************
        // Convertendo Texto ISO 8601 para Data-Hora
        //********************************************************
        LocalDate localDate2 = LocalDate.parse("2023-07-18");
        LocalDateTime localDateTime2 = LocalDateTime.parse("2023-07-18T19:32:34");
        Instant instant02 = Instant.parse("2023-07-18T16:42:27Z");

        // Convertendo para horário do Brasil
        Instant instant03 = Instant.parse("2024-05-26T16:18:27-03:00");

        System.out.println("\nLocal Date from Text = " + localDate2);
        System.out.println("Local Date Time from Text = " + localDateTime2);
        System.out.println("Instant from Text = " + instant02);
        System.out.println("Instant from Text with TimeZone from Brazil = " + instant03);


        //Especificando formatos com DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");


        LocalDate localDate3 = LocalDate.parse("20/07/2024", formatter);
        LocalDateTime localDateTime3 = LocalDateTime.parse("20/07/2024 01:30", formatter2);

        LocalDate localDate4 = LocalDate.of(2022, 7, 20);
        LocalDateTime localDateTime4 = LocalDateTime.of(2022, 7, 14, 14, 30);


        System.out.println("Parsing custom formats: " + localDate3);
        System.out.println("Parsing custom LocalDateTime: " + localDateTime3);

        System.out.println("\nLocalDate.of = " + localDate4);
        System.out.println("LocalDateTime.of = " + localDateTime4);
    }
}
