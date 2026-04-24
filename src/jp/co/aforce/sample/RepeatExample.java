package jp.co.aforce.sample;

public class RepeatExample {
	public static String repeat(String word, int times) {
		String result = "";
		
		for (int i= 0; i < times; i++) {
			result += word;
		}
		return result;
	}
	
	public static void main(String[] args) {
		String output = repeat("Java", 3);
		System.out.println(output);
	}

}
