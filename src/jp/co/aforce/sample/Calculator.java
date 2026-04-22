package jp.co.aforce.sample;


public class Calculator {
	public static void main(String args[]) {
		/*　計算をする　*/
		int a =1;
		int b =2;
		int c =a + b;
		/*　計算した結果を表示する　*/
		System.out.println("1 + 2 = " + c);
		
		String str1 = "java";
		String str2 = "programing";
		String str3 = str1.substring(1, 3) + str2.substring(2, 5);
		
		System.out.println(str3);

	}
}
	
