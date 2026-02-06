package Classes;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calendar {

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd");
        LocalDate d01 = LocalDate.now();

        System.out.println("-----------------------------------------");
        System.out.printf("February, %s Friday \n", fmt1.format(d01));

        System.out.print("    Sun  Mon  Tue  Wed  Thu  Fri  Sat\n");

        LocalDate base = LocalDate.of(2026, 2, 1);

        for (int week = 0; week < 4; week++) {
            System.out.print("    ");

            for (int day = 0; day < 7; day++) {
                LocalDate currentDate = base.plusWeeks(week).plusDays(day);
                if (day > 0) System.out.print("  ");
                System.out.printf("%2s ", fmt2.format(currentDate));
            }
            System.out.println();
        }
        System.out.println("-----------------------------------------");
    }
}
