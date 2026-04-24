package jp.co.aforce.sample;

public class EvenCheck {
	public static boolean isEven(int num) {
		return num % 2 == 0;
	}
	
	public static void main(String[] args) {
		System.out.println("１は偶数？" + isEven(1));
		System.out.println("２は偶数？" + isEven(2));
		System.out.println("３は偶数？" + isEven(3));
	}

}
