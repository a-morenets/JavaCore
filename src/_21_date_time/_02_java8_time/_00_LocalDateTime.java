package _21_date_time._02_java8_time;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class _00_LocalDateTime {

    public static void main(String[] args) {

        // Now()

        LocalDate localDateNow = LocalDate.now();
        System.out.println("localDateNow = " + localDateNow); // 2018-10-08

        LocalTime localTimeNow = LocalTime.now();
        System.out.println("localTimeNow = " + localTimeNow); // 10:37:50.771

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTimeNow = " + localDateTime); // 2018-10-08T10:37:50.771


        // Of (LocalDate)

        LocalDate localDate1 = LocalDate.of(2020, Month.SEPTEMBER, 23);
        System.out.println("localDate1 = " + localDate1); // 2020-09-23

        LocalDate localDate2 = LocalDate.of(2021, 1, 1);
        System.out.println("localDate2 = " + localDate2); // 2021-01-01

        LocalDate localDate3 = LocalDate.ofYearDay(2020, 361);
        System.out.println("localDate3 = " + localDate3); // 2020-12-26


        // Of (LocalTime)

        LocalTime localTime1 = LocalTime.of(12, 10);
        System.out.println("localTime1 = " + localTime1); // 12:10

        LocalTime localTime2 = LocalTime.of(18, 15, 10);
        System.out.println("localTime2 = " + localTime2); // 18:15:10

        LocalTime localTime3 = LocalTime.of(23, 59, 59, 700);
        System.out.println("localTime3 = " + localTime3); // 23:59:59.000000700

        LocalTime localTime4 = LocalTime.ofSecondOfDay(9_124);
        System.out.println("localTime4 = " + localTime4); // 02:32:04

        LocalTime localTime5 = LocalTime.ofNanoOfDay(100_000_000_000L);
        System.out.println("localTime5 = " + localTime5); // 00:01:40


        // Of (LocalDateTime)

        LocalDateTime localDateTime1 = LocalDateTime.of(1992, Month.AUGUST, 24, 12, 0);
        System.out.println("localDateTime1 = " + localDateTime1); // 1992-08-24T12:00

        LocalDateTime localDateTime2 = LocalDateTime.of(2004, Month.AUGUST, 23, 17, 15, 2);
        System.out.println("localDateTime2 = " + localDateTime2); // 2004-08-23T17:15:02

        LocalDateTime localDateTime3 = LocalDateTime.of(2008, Month.JANUARY, 6, 20, 45, 2, 2);
        System.out.println("localDateTime3 = " + localDateTime3); // 2008-01-06T20:45:02.000000002

        LocalDateTime localDateTime4 = LocalDateTime.of(2009, 1, 13, 9, 7);
        System.out.println("localDateTime4 = " + localDateTime4); // 2009-01-13T09:07

        LocalDateTime localDateTime5 = LocalDateTime.of(2012, 4, 4, 6, 16);
        System.out.println("localDateTime5 = " + localDateTime5); // 2012-04-04T06:16

        LocalDateTime localDateTime6 = LocalDateTime.of(2018, 10, 14, 4, 20);
        System.out.println("localDateTime6 = " + localDateTime6); // 2018-10-14T04:20

        LocalDateTime localDateTime7 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime7 = " + localDateTime7); // 2018-10-08T10:50:20.607


        // Plus LocalDate

        localDateNow = LocalDate.now();
        System.out.println("localTimeNow = " + localDateNow); // 2018-01-21

        LocalDate plus2Days = localDateNow.plusDays(2);
        System.out.println("plus2Days = " + plus2Days); // 2018-01-23

        LocalDate plusWeek = localDateNow.plusWeeks(1);
        System.out.println("plusWeek = " + plusWeek); // 2018-01-28

        LocalDate plus3Months = localDateNow.plusMonths(3);
        System.out.println("plus3Months = " + plus3Months); // 2018-04-21

        LocalDate plusPeriod = localDateNow.plus(Period.ofDays(3));
        System.out.println("plusPeriod = " + plusPeriod); // 2018-01-24

        LocalDate plusMillennia = localDateNow.plus(1, ChronoUnit.MILLENNIA); // 1000 years
        System.out.println("plusMillennia = " + plusMillennia); // 3018-01-21

        // Minus LocalDate

        localDateNow = LocalDate.now();
        System.out.println("localTimeNow = " + localDateNow); // 2018-01-21

        LocalDate minusDays = localDateNow.minusDays(3);
        System.out.println("minusDays = " + minusDays); // 2018-01-18

        LocalDate minusWeeks = localDateNow.minusWeeks(2);
        System.out.println("minusWeeks = " + minusWeeks); // 2018-01-07

        LocalDate minusMonths = localDateNow.minusMonths(4);
        System.out.println("minusMonths = " + minusMonths); // 2017-09-21

        LocalDate minusPeriod = localDateNow.minus(Period.ofDays(1));
        System.out.println("minusPeriod = " + minusPeriod); // 2018-01-20

        LocalDate minusEras = localDateNow.minus(1, ChronoUnit.CENTURIES); // 100 years
        System.out.println("minusEras = " + minusEras); // 1918-01-21


        // +/- negative values

        localDateNow = LocalDate.now();
        System.out.println("localTimeNow = " + localDateNow); // 2018-01-21

        LocalDate plusNegative = localDateNow.plusDays(-1);
        System.out.println("plusNegative = " + plusNegative); // 2018-01-20

        LocalDate minusNegative = localDateNow.minusDays(-1);
        System.out.println("minusNegative = " + minusNegative); // 2018-01-22


        // Plus LocalTime

        localTimeNow = LocalTime.now();
        System.out.println("localTimeNow = " + localTimeNow); // 08:49:39.678703

        LocalTime plusNanos = localTimeNow.plusNanos(100_000);
        System.out.println("plusNanos = " + plusNanos); // 08:49:39.678803

        LocalTime plusSeconds = localTimeNow.plusSeconds(20);
        System.out.println("plusSeconds = " + plusSeconds); // 08:49:59.678703

        LocalTime plusMinutes = localTimeNow.plusMinutes(20);
        System.out.println("plusMinutes = " + plusMinutes); // 09:09:39.678703

        LocalTime plusHours = localTimeNow.plusHours(6);
        System.out.println("plusHours = " + plusHours); // 14:51:58.601216

        LocalTime plusMillis = localTimeNow.plus(Duration.ofMillis(100));
        System.out.println("plusMillis = " + plusMillis); // 08:49:39.778703

        LocalTime plusHalfDay = localTimeNow.plus(1, ChronoUnit.HALF_DAYS);
        System.out.println("plusHalfDay = " + plusHalfDay); // 20:49:39.678703


        // Minus LocalTime

        localTimeNow = LocalTime.now();
        System.out.println("localTimeNow = " + localTimeNow); // 08:57:19.743004

        LocalTime minusNanos = localTimeNow.minusNanos(100_000);
        System.out.println("minusNanos = " + minusNanos); // 08:57:19.742904

        LocalTime minusSeconds = localTimeNow.minusSeconds(20);
        System.out.println("minusSeconds = " + minusSeconds); // 08:56:59.743004

        LocalTime minusMinutes = localTimeNow.minusMinutes(20);
        System.out.println("minusMinutes = " + minusMinutes); // 08:37:19.743004

        LocalTime minusHours = localTimeNow.minusHours(6);
        System.out.println("minusHours = " + minusHours); // 02:57:19.743004

        LocalTime minusMillis = localTimeNow.minus(Duration.ofMillis(100));
        System.out.println("minusMillis = " + minusMillis); // 08:57:19.643004

        LocalTime minusHalfDay = localTimeNow.minus(1, ChronoUnit.HALF_DAYS);
        System.out.println("minusHalfDay = " + minusHalfDay); // 20:57:19.743004


        // Plus LocalDateTime

        LocalDateTime localDateTimeNow = LocalDateTime.now();
        System.out.println("localDateNow = " + localDateTimeNow); // 2018-01-21T09:11:48.486298

        LocalDateTime minusNanosDateTime = localDateTimeNow.plusNanos(780_000_000);
        System.out.println("minusNanosDateTime = " + minusNanosDateTime); // 2018-01-21T09:11:49.266298

        LocalDateTime minusSecondsDateTime = localDateTimeNow.plusSeconds(59);
        System.out.println("minusSecondsDateTime = " + minusSecondsDateTime); // 2018-01-21T09:12:47.486298

        LocalDateTime minusMinutesDateTime = localDateTimeNow.plusMinutes(5);
        System.out.println("minusMinutesDateTime = " + minusMinutesDateTime); // 2018-01-21T09:16:48.486298

        LocalDateTime minusHoursDateTime = localDateTimeNow.plusHours(3);
        System.out.println("minusHoursDateTime = " + minusHoursDateTime); // 2018-01-21T12:11:48.486298

        LocalDateTime minusDaysDateTime = localDateTimeNow.plusDays(7);
        System.out.println("minusDaysDateTime = " + minusDaysDateTime); // 2018-01-28T09:11:48.486298

        LocalDateTime minusWeeksDateTime = localDateTimeNow.plusWeeks(3);
        System.out.println("minusWeeksDateTime = " + minusWeeksDateTime); // 2018-02-11T09:11:48.486298

        LocalDateTime minusMonthsDateTime = localDateTimeNow.plusMonths(5);
        System.out.println("minusMonthsDateTime = " + minusMonthsDateTime); // 2018-06-21T09:11:48.486298

        LocalDateTime minusYearsDateTime = localDateTimeNow.plusYears(2);
        System.out.println("minusYearsDateTime = " + minusYearsDateTime); // 2020-01-21T09:11:48.486298

        LocalDateTime minusPeriodDateTime = localDateTimeNow.plus(Period.ofWeeks(2));
        System.out.println("minusPeriodDateTime = " + minusPeriodDateTime); // 2018-02-04T09:11:48.486298

        LocalDateTime minusDecadesDateTime = localDateTimeNow.plus(1, ChronoUnit.DECADES); // 10 years
        System.out.println("minusDecadesDateTime = " + minusDecadesDateTime); // 2028-01-21T09:11:48.486298


        // Minus LocalDateTime

        localDateTimeNow = LocalDateTime.now();
        System.out.println("localDateNow = " + localDateTimeNow); // 2018-01-21T09:09:33.650251

        minusNanosDateTime = localDateTimeNow.minusNanos(780_000_000);
        System.out.println("minusNanosDateTime = " + minusNanosDateTime); // 2018-01-21T09:09:32.870251

        minusSecondsDateTime = localDateTimeNow.minusSeconds(59);
        System.out.println("minusSecondsDateTime = " + minusSecondsDateTime); // 2018-01-21T09:08:34.650251

        minusMinutesDateTime = localDateTimeNow.minusMinutes(5);
        System.out.println("minusMinutesDateTime = " + minusMinutesDateTime); // 2018-01-21T09:04:33.650251

        minusHoursDateTime = localDateTimeNow.minusHours(3);
        System.out.println("minusHoursDateTime = " + minusHoursDateTime); // 2018-01-21T06:09:33.650251

        minusDaysDateTime = localDateTimeNow.minusDays(7);
        System.out.println("minusDaysDateTime = " + minusDaysDateTime); // 2018-01-14T09:09:33.650251

        minusWeeksDateTime = localDateTimeNow.minusWeeks(3);
        System.out.println("minusWeeksDateTime = " + minusWeeksDateTime); // 2017-12-31T09:09:33.650251

        minusMonthsDateTime = localDateTimeNow.minusMonths(5);
        System.out.println("minusMonthsDateTime = " + minusMonthsDateTime); // 2017-08-21T09:09:33.650251

        minusYearsDateTime = localDateTimeNow.minusYears(2);
        System.out.println("minusYearsDateTime = " + minusYearsDateTime); // 2016-01-21T09:09:33.650251

        minusPeriodDateTime = localDateTimeNow.minus(Period.ofWeeks(2));
        System.out.println("minusPeriodDateTime = " + minusPeriodDateTime); // 2018-01-07T09:09:33.650251

        minusDecadesDateTime = localDateTimeNow.minus(1, ChronoUnit.DECADES);
        System.out.println("minusDecadesDateTime = " + minusDecadesDateTime); // 2008-01-21T09:09:33.650251


        // LocalDate compare

        localDateNow = LocalDate.now();
        LocalDate _2017 = LocalDate.of(2017, 9, 23);
        boolean after = localDateNow.isAfter(_2017); // true
        boolean before = localDateNow.isBefore(_2017); // false


        // LocalDate after, before

        localTimeNow = LocalTime.now();
        LocalTime _2HoursAfter = localTimeNow.plusHours(2);
        after = localTimeNow.isAfter(_2HoursAfter); // false
        before = localTimeNow.isBefore(_2HoursAfter); // true


        // LocalDateTime after, before

        localDateTimeNow = LocalDateTime.now();
        LocalDateTime monthAgo = localDateTimeNow.minusMonths(1);
        after = localDateTimeNow.isAfter(monthAgo); // true
        before = localDateTimeNow.isBefore(monthAgo); // false


        // ... compareTo()

        localDateNow = LocalDate.now();
        LocalDate tomorrow = LocalDate.now().plusDays(1);
        boolean isDateAfter = localDateNow.compareTo(tomorrow) > 0; // false

        localTimeNow = LocalTime.now();
        LocalTime hourLater = localTimeNow.plusHours(1);
        boolean isTimeBefore = localTimeNow.compareTo(hourLater) < 0; // true

        localDateTimeNow = LocalDateTime.now();
        LocalDateTime lastYear = localDateTimeNow.minusYears(1);
        boolean isDateTimeAfter = localDateTimeNow.compareTo(lastYear) > 0; // true
    }
}
