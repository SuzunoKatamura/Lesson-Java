package jp.co.aforce.sample;

public class Scanner {
	
	public static void main(String[] args) {
		
		int a = 1;{
			if (a % 2 == 0) {
				System.out.println ("偶数です");
			} else {
				System.out.println ("奇数です");
			}
	
		}
		
			if (a > 0) {
				System.out.println ("正の数です");
			} else {
				System.out.println ("負の数です");
			}
			
			
		int b = 3;
		int c = 4;
		int d = 5;
			if (b + c > d && b + d > c && c + d > b) {
				System.out.println ("三角形を作れます");
			} else {
				System.out.println ("三角形を作れません");
			}
		
//		System.out.println("年齢を入力してください");
//		int age = scanner.nextInt();
//		
//			if (age <= 12) {
//				System.out.println ("入場料は無料です");
//			} else if (age <= 59) {
//				System.out.println ("入場料は500円です");
//			} else {
//				System.out.println ("入場料は1000円です");
//			}
			
			
//		int number = 10;
//		
//		if (number = 5) {
//			System.out.println ("the number is 5");
//		} else {
//			System.out.println ("the number is not 5");
//		}
		
			
		String date = "4";
		String message;
			switch (date) {
				case"1":
					message = "Sunday";
					break;
				case"2":
					message = "Monday";
					break;
				case"3":
					message = "Tuseday";
					break;
				case"4":
					message = "Wednesday";
					break;
				case"5":
					message = "Thursday";
					break;
				case"6":
					message = "Friday";
					break;
				case"7":
					message = "Saturday";
					break;
				default:
					message = "What's the date today?";
			}
			System.out.println(message);
			
			
		String month = "1";
		String message1;
			switch (month) {
					case"1":
						message1 = "January";
						break;
					case"2":
						message1 = "Feb";
						break;
					case"3":
						message1 = "March";
						break;
					case"4":
						message1 = "April";
						break;
					case"5":
						message1 = "May";
						break;
					case"6":
						message1 = "June";
						break;
					case"7":
						message1 = "July";
						break;
					case"8":
						message1 = "August";
						break;
					case"9":
						message1 = "September";
						break;
					case"10":
						message1 = "October";
						break;
					case"11":
						message1 = "November";
						break;
					case"12":
						message1 = "December";
						break;
					default:
						message1 = "What's the month?";
				}
				System.out.println(message1);
				
				
				
		String grades = "B";
		String message11;
			switch (grades) {
				case"A":
					message11 = "めっちゃすごい";
					break;
				case"B":
					message11 = "すごい";
					break;
				case"C":
					message11 = "ふつう";
					break;
				case"D":
					message11 = "まあまあ";
					break;
				case"F":
					message11 = "あかん";
					break;
					
				default:
					message11 = "What's the date today?";
			}
			System.out.println(message11);
		
		
		
	}

}
