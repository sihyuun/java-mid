package ex.time;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {

    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);

        Period durBetween = Period.between(startDate, endDate);
        long dayBetween = ChronoUnit.DAYS.between(startDate, endDate);

        //코드 작성
        System.out.println("시작 날짜: " + startDate);
        System.out.println("종료 날짜: " + endDate);
        System.out.println("남은 기간: " + durBetween.getYears() + "년 " + durBetween.getMonths() + "개월 " + durBetween.getDays() + "일");
        System.out.println("디데이: " + dayBetween + "일 남음");
    }
}
