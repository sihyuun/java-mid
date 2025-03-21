package ex.time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TestZone {

    public static void main(String[] args) {

        LocalDateTime ldt = LocalDateTime.of(2024, 1, 1, 9, 00);

        ZonedDateTime seZdt = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
        ZonedDateTime loZdt = ZonedDateTime.of(ldt, ZoneId.of("Europe/London"));
        ZonedDateTime neZdt = ZonedDateTime.of(ldt, ZoneId.of("America/New_York"));

        System.out.println("서울의 회의 시간: " + seZdt);
        System.out.println("런던의 회의 시간: " + loZdt);
        System.out.println("뉴욕의 회의 시간: " + neZdt);
    }
}
