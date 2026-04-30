package jp.co.aforce.sample;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Now {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(); // 現在日時
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年M月d日 H時m分");
		String formatted = now.format(formatter);

		System.out.println(formatted);
	}

}
