package chapter_11.lesson_113.application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        //********************************************************
        // Cálculos com Data-Hora Local e Global
        //********************************************************
        LocalDate pastWeekLocalDate = d04.minusWeeks(1);
        System.out.println("Past Week: " + pastWeekLocalDate);

        LocalDate nextWeekLocalDate = d04.plusWeeks(1);
        System.out.println("Next Week: " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusWeeks(1);
        System.out.println("Past Week LocalDateTime: " + pastWeekLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d05.plusWeeks(1);
        System.out.println("Next Week LocalDateTime: " + nextWeekLocalDateTime);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        System.out.println("Past Week Instant: " + pastWeekInstant);

        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        System.out.println("Next Week Instant: " + nextWeekInstant);

        //********************************************************
        // Calculando durações
        //********************************************************
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        System.out.println("t1 days : " + t1.toDays());

        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);
        System.out.println("t2 days : " + t2.toDays());

        Duration t3 = Duration.between(pastWeekInstant, d06);
        System.out.println("t3 days : " + t3.toDays());

        Duration t4 = Duration.between(d06, pastWeekInstant);
        System.out.println("t4 days : " + t4.toDays());
    }
}
