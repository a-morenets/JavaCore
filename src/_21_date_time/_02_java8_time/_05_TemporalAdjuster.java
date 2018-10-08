package _21_date_time._02_java8_time;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

import static java.time.Month.FEBRUARY;
import static java.time.Month.JULY;
import static java.time.temporal.TemporalAdjusters.lastDayOfMonth;

public class _05_TemporalAdjuster {

    public static void main(String[] args) {

        // Date of 4th sunday in given month

        LocalDate localDate = LocalDate.of(2018, Month.AUGUST, 24);
        TemporalAdjuster fourthSundayInAugust2018 = TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.SUNDAY);
        System.out.println("fourthSundayInAugust2018 = " + localDate.with(fourthSundayInAugust2018)); // 2018-08-26

        // The last day of February

        LocalDate lastDayInFeb2018 = localDate.with(FEBRUARY).with(lastDayOfMonth());
        System.out.println("lastDayInFeb2018 = " + lastDayInFeb2018); // 2018-02-28


        // First monday in March 2017

        localDate = LocalDate.of(2017, Month.MARCH, 19);
        TemporalAdjuster firstMondayInMarch2017 = TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);
        System.out.println("firstMondayInMarch2017 = " + localDate.with(firstMondayInMarch2017));


        // How many days until Friday

        localDate = LocalDate.of(2017, Month.APRIL, 21);
        TemporalAdjuster lastFriInMonthAdjuster = TemporalAdjusters.lastInMonth(DayOfWeek.FRIDAY);
        LocalDate lastFri = localDate.with(lastFriInMonthAdjuster); // 2017-04-28

        Period until = localDate.until(lastFri);
        System.out.println(until.getDays()); // 7


        // First XXX

        localDate = LocalDate.of(2017, Month.MAY, 10);
        System.out.println("localDate = " + localDate);

        TemporalAdjuster firstDayOfMonth = TemporalAdjusters.firstDayOfMonth();
        TemporalAdjuster firstDayOfNextMonth = TemporalAdjusters.firstDayOfNextMonth();
        TemporalAdjuster firstDayOfYear = TemporalAdjusters.firstDayOfYear();
        TemporalAdjuster firstDayOfNextYear = TemporalAdjusters.firstDayOfNextYear();

        System.out.println("firstDayOfMonth = " + localDate.with(firstDayOfMonth)); // 2017-04-01
        System.out.println("firstDayOfNextMonth = " + localDate.with(firstDayOfNextMonth)); // 2017-05-01
        System.out.println("firstDayOfYear = " + localDate.with(firstDayOfYear)); // 2017-01-01
        System.out.println("firstDayOfNextYear = " + localDate.with(firstDayOfNextYear)); // 2018-01-01


        // Last XXX

        localDate = LocalDate.of(2017, Month.APRIL, 17);
        System.out.println("localDate = " + localDate);

        TemporalAdjuster lastDayOfMonth = TemporalAdjusters.lastDayOfMonth();
        TemporalAdjuster lastDayOfYear = TemporalAdjusters.lastDayOfYear();

        System.out.println(localDate.with(lastDayOfMonth)); // 2017-04-30
        System.out.println(localDate.with(lastDayOfYear)); // 2017-12-31


        // Next Tuesday

        localDate = LocalDate.of(2020, Month.OCTOBER, 28);
        System.out.println("localDate = " + localDate);

        TemporalAdjuster nextTue = TemporalAdjusters.next(DayOfWeek.TUESDAY);
        System.out.println("nextTue = " + localDate.with(nextTue)); // 2020-11-03


        // Next or same Wednesday

        localDate = LocalDate.of(2020, Month.OCTOBER, 28);
        System.out.println("localDate = " + localDate);

        TemporalAdjuster nextOrSameWed = TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY);
        System.out.println("nextOrSameWed = " + localDate.with(nextOrSameWed)); // 2020-10-28


        // Previous

        localDate = LocalDate.of(2020, Month.OCTOBER, 28);
        System.out.println("localDate = " + localDate);

        TemporalAdjuster previousThu = TemporalAdjusters.previous(DayOfWeek.THURSDAY);
        TemporalAdjuster previousOrSameSat = TemporalAdjusters.previousOrSame(DayOfWeek.SATURDAY);

        System.out.println("previousThu = " + localDate.with(previousThu)); // 2020-10-22
        System.out.println("previousOrSameSat = " + localDate.with(previousOrSameSat)); // 2020-10-24
    }
}
