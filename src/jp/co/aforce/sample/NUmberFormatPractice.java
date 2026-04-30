package jp.co.aforce.sample;

public class NUmberFormatPractice {
	public static void main(String[] args) {
		try {
			int number = 10;
			int result = number / 2;
			System.out.println("２で割った結果：" + result);
		} catch (NumberFormatException e) {
			System.out.println("エラー：整数を入力してください");
		}

		try {
			System.out.println("try ブロック開始");
			throw new RuntimeException("エラー発生");
		} catch (Exception e) {
			System.out.println("catch ブロック:" + e.getMessage());
		} finally {
			System.out.println("finally ブロック");
		}
		System.out.println("プログラム終了");

		try {
			int result1 = 10 / 0;
			System.out.println("10を２で割った結果：" + result1);
		} catch (ArithmeticException e) {
			System.out.println("０で割ることはできません");
		}
		System.out.println("プログラムは継続します");

		try {
			int[] nums = { 1, 2, 3 };
			System.out.println(nums[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("配列の範囲外です");
		}
		System.out.println("プログラムは継続します");

		try {
			String input = "0";
			int number = Integer.parseInt(input);
			int result = 10 / number;
			System.out.println("結果：" + result);
		} catch (NumberFormatException e) {
			System.out.println("エラー：数値を入力してください");
		} catch (ArithmeticException e) {
			System.out.println("０で割ることはできません");
		}
		System.out.println("プログラムは継続します");
	}

}
