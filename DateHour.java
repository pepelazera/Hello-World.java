package Classes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateHour {

    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // I used to format some hour that I want to
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d11 = LocalDate.of(2026, 2, 2);
        LocalDateTime d12 = LocalDateTime.of(2026, 2, 2 , 1, 30);

        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2026-02-20");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-20T01:30:26");
        Instant d06 = Instant.parse("2026-02-20T01:30:26Z");
        Instant d07 = Instant.parse("2026-02-20T01:30:26-03:00");
        Instant d08 = Instant.parse("2026-02-20T01:30:26+01:00");

        LocalDate d09 = LocalDate.parse("02/02/2026", fmt1);
        LocalDateTime d10 = LocalDateTime.parse("02/02/2026 01:30", fmt2);

        System.out.println("d01 = " + d01.toString()); // "toString" here converts the Date-Hour to an ISO 8601 text
        System.out.println("d02 = " + d02.toString()); // Local hour
        System.out.println("d03 = " + d03.toString()); // Global hour (London hour)
        System.out.println("d04 = " + d04.toString()); // Using Iso standard and formated Local Date
        System.out.println("d05 = " + d05.toString()); // Using Iso standard again, but formated Local Date Time
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());

    }
}
