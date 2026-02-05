package Classes;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculationDateHour {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2026-02-05");
        LocalDateTime d05 = LocalDateTime.parse("2026-02-05T22:20:22");
        Instant d06 = Instant.parse("2026-02-05T22:30:26Z");

        LocalDate pastDaysLocalDate = d04.minusDays(7);
        LocalDate nextDaysLocalDate = d04.plusDays(7);

        LocalDate pastYearLocalDate = d04.minusYears(1);
        LocalDate nextYearLocalDate = d04.plusYears(4);

        System.out.println();
        System.out.println("past days local date = " + pastDaysLocalDate);
        System.out.println("next days local date = " + nextDaysLocalDate);

        System.out.println("Past years local date = " + pastYearLocalDate);
        System.out.println("Next years local date = " + nextYearLocalDate);

        LocalDateTime pastDaysLocalDateTime = d05.minusDays(7);
        LocalDateTime nextDaysLocalDateTime = d05.plusDays(7);

        System.out.println();
        System.out.println("Past days local date time = " + pastDaysLocalDateTime);
        System.out.println("Next days local date time = " + nextDaysLocalDateTime);

        Instant pastDaysInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextDaysInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println();
        System.out.println("Past days instant = " + pastDaysInstant);
        System.out.println("Next days instant = " + nextDaysInstant);

        Duration t1 = Duration.between(pastYearLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastDaysLocalDateTime, d05);
        Duration t3 = Duration.between(pastDaysInstant, d06);
        Duration t4 = Duration.between(d06, pastDaysInstant);

        System.out.printf("\nt1: %s days", t1.toDays());
        System.out.printf("\nt2: %s days", t2.toDays());
        System.out.printf("\nt3: %s days", t3.toDays());
        System.out.printf("\nt4: %s days", t4.toDays());

    }
}
