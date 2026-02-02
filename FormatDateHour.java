package Classes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class FormatDateHour {

    public static void main(String[] args) {

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html


        LocalDate d04 = LocalDate.parse("2026-02-02");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-02T01:30:26");
        Instant d06 = Instant.parse("2026-02-02T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // This command will put the time of my local, not the time of London.
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT; // Use this to format in ISO format

        System.out.println("d04 = " + d04.format(fmt1));
        System.out.println("d04 = " + fmt1.format(d04)); // The same that I did before, but I changed the order

        System.out.println("d05 = " + fmt1.format(d05));
        System.out.println("d05 = " + fmt2.format(d05));
        System.out.println("d05 = " + fmt4.format(d05)); // Only accept Local Data

        System.out.println("d06 = " + d06);
        System.out.println("d06 = " + fmt3.format(d06)); // d06 only accept fmt3, because d06 is an Instant.
        System.out.println("d06 = " + fmt5.format(d06));

    }
}
