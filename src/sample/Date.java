package sample;

import java.time.LocalDate;

public class Date {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate nextweek = today.plusWeeks(1);

		System.out.println("今日：" + today);
		System.out.println("一週間後" + nextweek);
	}

}
