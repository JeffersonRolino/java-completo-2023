package chapter_11.lesson_112.application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Main {
    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");

        // Convertendo Instant (Data e Hora Global) para LocalDate (Data local)
        LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        System.out.println("r1 = " + r1);

        // Usando o fuso horário de Portugual
        LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r2 = " + r2);

        LocalDateTime r3 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
        System.out.println("r3 = " + r3);

        // Obtendo Dia, mês e ano de uma Data Local
        System.out.println("\nObtendo Dia, mês e ano de uma Data Local: " + d04);
        System.out.println("d04 dia = " + d04.getDayOfMonth());
        System.out.println("d04 mês/nome = " + d04.getMonth());
        System.out.println("d04 mês/número = " + d04.getMonthValue());
        System.out.println("d04 ano = " + d04.getYear());

        // Obtendo horário de uma Data Hora Local
        System.out.println("\nObtendo horário de uma Data Hora Local: " + d05);
        System.out.println("d05 hora = " + d05.getHour());
        System.out.println("d05 minutos = " + d05.getMinute());
        System.out.println("d05 segundos = " + d05.getSecond());
    }
}
