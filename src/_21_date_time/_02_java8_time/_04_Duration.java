package _21_date_time._02_java8_time;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class _04_Duration {

    public static void main(String[] args) {

        // How much hours, minutes, seconds between two times?

        LocalTime _10AM = LocalTime.of(10, 10,15);
        LocalTime _9PM = LocalTime.of(21, 30);

        Duration duration = Duration.between(_10AM, _9PM);
        System.out.println("duration = " + duration); // PT11H19M45S


        // How many days between two dates?

        LocalDate birthday1 = LocalDate.of(1975, 3, 28);
        LocalDate birthday2 = LocalDate.of(1977, 1, 22);

        // Duration works only with time!
        // So, we need to convert LocalDate to LocalDateTime using atStartOfDay()
        duration = Duration.between(birthday1.atStartOfDay(), birthday2.atStartOfDay());
        System.out.println(duration.toDays()); // 666


        // Use of ChronoUnit

        long days = ChronoUnit.DAYS.between(birthday1, birthday2);
        System.out.println(days);// 666
    }
}
