package Classes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TextDateHour {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd");

        // Put the dates
        LocalDateTime d01 = LocalDateTime.now();
        LocalDate d02 = LocalDate.parse("2026-02-01");
        LocalDate d03 = LocalDate.parse("2026-02-02");
        LocalDate d04 = LocalDate.parse("2026-02-03");
        LocalDate d05 = LocalDate.parse("2026-02-04");
        LocalDate d06 = LocalDate.parse("2026-02-05");
        LocalDate d07 = LocalDate.parse("2026-02-06");
        LocalDate d08 = LocalDate.parse("2026-02-07");

        // Add more weeks
        LocalDate nextWeekD02 = d02.plusWeeks(1);
        LocalDate nextWeekD03 = d03.plusWeeks(1);
        LocalDate nextWeekD04 = d04.plusWeeks(1);
        LocalDate nextWeekD05 = d05.plusWeeks(1);
        LocalDate nextWeekD06 = d06.plusWeeks(1);
        LocalDate nextWeekD07 = d07.plusWeeks(1);
        LocalDate nextWeekD08 = d08.plusWeeks(1);

        LocalDate next2WeeksD02 = d02.plusWeeks(2);
        LocalDate next2WeeksD03 = d03.plusWeeks(2);
        LocalDate next2WeeksD04 = d04.plusWeeks(2);
        LocalDate next2WeeksD05 = d05.plusWeeks(2);
        LocalDate next2WeeksD06 = d06.plusWeeks(2);
        LocalDate next2WeeksD07 = d07.plusWeeks(2);
        LocalDate next2WeeksD08 = d08.plusWeeks(2);

        LocalDate next3WeeksD02 = d02.plusWeeks(3);
        LocalDate next3WeeksD03 = d03.plusWeeks(3);
        LocalDate next3WeeksD04 = d04.plusWeeks(3);
        LocalDate next3WeeksD05 = d05.plusWeeks(3);
        LocalDate next3weeksD06 = d06.plusWeeks(3);
        LocalDate next3WeeksD07 = d07.plusWeeks(3);
        LocalDate next3WeeksD08 = d08.plusWeeks(3);

        // System.outs
        System.out.println();
        System.out.printf("%s - February, Tuesday \n", fmt1.format(d01));
        System.out.println("\nSun  Mon  Tue  Wed  Thu  Fri  Sat");
        System.out.printf("%s", fmt2.format(d02));
        System.out.printf("   %s", fmt2.format(d03));
        System.out.printf("   %s", fmt2.format(d04));
        System.out.printf("   %s", fmt2.format(d05));
        System.out.printf("   %s", fmt2.format(d06));
        System.out.printf("   %s", fmt2.format(d07));
        System.out.printf("   %s", fmt2.format(d08));

        System.out.printf("\n%s", fmt2.format(nextWeekD02));
        System.out.printf("   %s", fmt2.format(nextWeekD03));
        System.out.printf("   %s", fmt2.format(nextWeekD04));
        System.out.printf("   %s", fmt2.format(nextWeekD05));
        System.out.printf("   %s", fmt2.format(nextWeekD06));
        System.out.printf("   %s", fmt2.format(nextWeekD07));
        System.out.printf("   %s", fmt2.format(nextWeekD08));

        System.out.printf("\n%s", fmt2.format(next2WeeksD02));
        System.out.printf("   %s", fmt2.format(next2WeeksD03));
        System.out.printf("   %s", fmt2.format(next2WeeksD04));
        System.out.printf("   %s", fmt2.format(next2WeeksD05));
        System.out.printf("   %s", fmt2.format(next2WeeksD06));
        System.out.printf("   %s", fmt2.format(next2WeeksD07));
        System.out.printf("   %s", fmt2.format(next2WeeksD08));

        System.out.printf("\n%s", fmt2.format(next3WeeksD02));
        System.out.printf("   %s", fmt2.format(next3WeeksD03));
        System.out.printf("   %s", fmt2.format(next3WeeksD04));
        System.out.printf("   %s", fmt2.format(next3WeeksD05));
        System.out.printf("   %s", fmt2.format(next3weeksD06));
        System.out.printf("   %s", fmt2.format(next3WeeksD07));
        System.out.printf("   %s\n", fmt2.format(next3WeeksD08));

        System.out.print("------------------------------------");
    }
}
