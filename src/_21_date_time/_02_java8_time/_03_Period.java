package _21_date_time._02_java8_time;

import java.time.LocalDate;
import java.time.Period;

public class _03_Period {

    public static void main(String[] args) {

        // How much years, months and days between two dates?

        LocalDate nextBirthday = LocalDate.of(2019, 3, 28);
        LocalDate now = LocalDate.now();

        Period period = Period.between(now, nextBirthday);
        int days = period.getDays();

        System.out.println(now);
        System.out.println(period);
        System.out.println(days);


        // 1 year 15 months 40 days

        period = Period.of(1, 15, 40);
        System.out.println(period); // P1Y15M40D

        days = period.getDays();
        System.out.println(days); // 40


        // 1 year 15 months 40 days - normalized

        period = Period.of(1, 15, 60).normalized();
        System.out.println(period); // P2Y3M60D

        days = period.getDays();
        System.out.println(days); // 60


        // Adding period to date

        period = Period.of(1, 15, 60);
        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalDate plus = localDate.plus(period); // 2020-05-31
    }
}
