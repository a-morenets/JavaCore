package _21_date_time._02_java8_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;

public class _01_DateTimeFormatter {

    public static void main(String[] args) {

        // Format LocalDate

        LocalDate localDateNow = LocalDate.now();
        System.out.println("localDateNow = " + localDateNow); // 2018-10-08 - no formatting

        String basicIsoDate = localDateNow.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("basicIsoDate = " + basicIsoDate); // 20180128

        String isoDate = localDateNow.format(DateTimeFormatter.ISO_DATE);
        System.out.println("isoDate = " + isoDate); // 2018-01-28

        String isoWeekDate = localDateNow.format(DateTimeFormatter.ISO_WEEK_DATE);
        System.out.println("isoWeekDate = " + isoWeekDate); // 2018-W04-7

        String isoLocalDate = localDateNow.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("isoLocalDate = " + isoLocalDate); // 2018-01-28

        String isoOrdinalDate = localDateNow.format(DateTimeFormatter.ISO_ORDINAL_DATE);
        System.out.println("isoOrdinalDate = " + isoOrdinalDate); // 2018-028


        // Custom LocalDate format

        localDateNow = LocalDate.now();

        String nativeFormat = localDateNow.format(DateTimeFormatter.ofPattern("dd MMM yyyy"));
        System.out.println("nativeFormat = " + nativeFormat); // 28 Jan 2018

        String french = localDateNow.format(DateTimeFormatter.ofPattern("dd MMM yyyy", Locale.FRENCH));
        System.out.println("french = " + french); // 28 janv. 2018


        // Format LocalTime

        LocalTime localTimeNow = LocalTime.now();
        System.out.println("localTimeNow = " + localTimeNow); // 13:51:16.872

        String isoLocalTime = localTimeNow.format(DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println("isoLocalTime = " + isoLocalTime); // 13:51:16.872

        String isoTime = localTimeNow.format(DateTimeFormatter.ISO_TIME);
        System.out.println("isoTime = " + isoTime); // 13:51:16.872


        // Custom LocalTime format

        localTimeNow = LocalTime.now();

        nativeFormat = localTimeNow.format(DateTimeFormatter.ofPattern("hh:mm:ss "));
        System.out.println("nativeFormat = " + nativeFormat); // 13:54:30.092

        String engFormat = localTimeNow.format(DateTimeFormatter.ofPattern("h:mm a"));
        System.out.println("engFormat = " + engFormat); // 1:54 PM


        // Format LocalDateTime

        LocalDateTime localDateTimeNow = LocalDateTime.now();

        String rfcFormat = localDateTimeNow.format(
                DateTimeFormatter.ofPattern("E, dd MMM yyyy hh:mm:ss"));
        System.out.println("rfcFormat = " + rfcFormat); // пн, 08 жовт. 2018 01:57:51

        String rfcFormatEN = localDateTimeNow.format(
                DateTimeFormatter.ofPattern("E, dd MMM yyyy HH:mm:ss", Locale.ENGLISH));
        System.out.println("rfcFormatEN = " + rfcFormatEN); // Mon, 08 Oct 2018 13:57:51

        basicIsoDate = localDateTimeNow.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("basicIsoDate = " + basicIsoDate); // 20181008

        String isoDateTime = localDateTimeNow.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("isoDateTime = " + isoDateTime); // 2018-10-08T13:57:51.635

        String isoLocalDateTime = localDateTimeNow.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println("isoLocalDateTime = " + isoLocalDateTime); // 2018-10-08T13:57:51.635

        isoLocalDate = localDateTimeNow.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println("isoLocalDate = " + isoLocalDate); // 2018-10-08


        System.out.println(parse("29.10.83"));
        System.out.println(parse("29.10.1983"));
        System.out.println(parse("29/10/83"));
    }

    static DateTimeFormatter[] formats = new DateTimeFormatter[] {
            DateTimeFormatter.ofPattern("dd.MM.yy"),
            DateTimeFormatter.ofPattern("dd.MM.yyyy"),
            DateTimeFormatter.ofPattern("dd/MM/yy")
    };

    static LocalDate parse(String date) {
        for (DateTimeFormatter format : formats) {
            try {
                return LocalDate.parse(date, format);
            } catch (DateTimeParseException ignored) {
            }
        }
        return null;
    }
}
