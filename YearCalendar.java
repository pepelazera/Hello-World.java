package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YearCalendar {

    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2026-01-01");
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd");

        LocalDate base = LocalDate.of(2026, 1, 1);

        for (int month = 0; month < 12; month++) {
            System.out.println();
            LocalDate monthBase = base.plusMonths(month).withDayOfMonth(1);
            System.out.printf("%s (%s)\n", fmt1.format(monthBase), monthBase.getDayOfWeek());

            System.out.print("    Sun  Mon  Tue  Wed  Thu  Fri  Sat\n");

            for (int week = 0; week < 6; week++) {
                System.out.print("     ");
                boolean hashDays = false;

                for (int day = 0; day < 7; day++) {
                    LocalDate current = monthBase.plusWeeks(week).plusDays(day);

                    if (current.getMonth() == monthBase.getMonth()) {
                        if (hashDays) System.out.print("  ");
                        System.out.printf("%2s ", fmt2.format(current));
                        hashDays = true;
                    } else {
                        System.out.print("   ");
                    }

                }

                if (hashDays) System.out.println();
            }
        }
    }
}
