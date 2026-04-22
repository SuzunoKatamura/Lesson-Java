package jp.co.aforce.sample;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class BirthdayCountdown {
	
    public static void main(String[] args) {
        LocalDate today = LocalDate.now(); // 今日の日付

        // 自分の誕生日
        LocalDate birthday = LocalDate.of(today.getYear(), 1, 12);

        // 今年の誕生日が過ぎてたら来年にする
        if (birthday.isBefore(today)) {
            birthday = birthday.plusYears(1);
        }

        long days = ChronoUnit.DAYS.between(today, birthday);

        System.out.println("誕生日まであと" + days);
    }


}
