package Classes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertDateHour {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2026-02-04");
        LocalDateTime d02 = LocalDateTime.parse("2026-02-04T10:26:22");
        Instant d03 = Instant.parse("2026-02-04T13:20:25Z"); // London Hour

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.systemDefault()); // Brazil hour
        LocalDateTime r4 = LocalDateTime.ofInstant(d03, ZoneId.of("America/New_York"));
        LocalDateTime r5 = LocalDateTime.now();

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);
        System.out.println("r5 = " + r5);

        System.out.println("d01 day = " + d01.getDayOfMonth());
        System.out.println("d01 mouth = " + d01.getMonthValue());
        System.out.println("d01 year = " + d01.getYear());

        System.out.println("d02 hour = " + d02.getHour());
        System.out.println("d02 minutes = " + d02.getMinute());

    }
}
