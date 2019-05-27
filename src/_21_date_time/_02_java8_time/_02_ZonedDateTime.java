package _21_date_time._02_java8_time;

import java.time.*;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class _02_ZonedDateTime {

    public static void main(String[] args) {

        // Zoned DateTime

        ZonedDateTime now = ZonedDateTime.now();
        System.out.println("now = " + now); // 2018-10-08T14:13:45.046+03:00[Europe/Helsinki]

        LocalDate localDate = LocalDate.of(2018, 1, 1);
        LocalTime localTime = LocalTime.of(10, 30);
        ZoneId zone = ZoneId.of("Europe/Kiev");
        ZonedDateTime kievTime = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println("kievTime = " + kievTime); // 2018-01-01T10:30+02:00[Europe/Kiev]


        // ZoneSameInstant (zone shift)

        localDate = LocalDate.of(2018, 1, 1);
        localTime = LocalTime.of(10, 30);
        zone = ZoneId.of("Europe/Kiev");

        kievTime = ZonedDateTime.of(localDate, localTime, zone);
        System.out.println("kievTime = " + kievTime); // 2018-01-01T10:30+02:00[Europe/Kiev]

        ZonedDateTime nyTime = kievTime.withZoneSameInstant(ZoneId.of("America/New_York"));
        System.out.println("nyTime = " + nyTime); // 2018-01-01T03:30-05:00[America/New_York]

        ZonedDateTime japanTime = kievTime.withZoneSameInstant(ZoneOffset.of("-09:00"));
        System.out.println("japanTime = " + japanTime); // 2017-12-31T23:30-09:00


        // Get all zones

        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();

        System.out.println("\n-------------------- Zones -------------------\n");
        availableZoneIds.forEach(System.out::println);


        // Get all zones with offsets

        System.out.println("\n--------------- Zones with offsets --------------\n");

        availableZoneIds.stream()
                .collect(Collectors.toMap(Function.identity(), _02_ZonedDateTime::getOffset))
                .forEach((z, offset) -> System.out.printf("%s (UTC%s) \n", z, offset));
    }

    private static String getOffset(String zone) {
        LocalDateTime LDT = LocalDateTime.now();
        ZonedDateTime zdt = LDT.atZone(ZoneId.of(zone));
        return zdt.getOffset().getId()/*.replace("Z", "+00:00")*/;
    }
}
