package jp.co.aforce.sample;

public class Admissionfee {
	
	public static void main(String[] args) {
		
/*		Scanner scanner = new Scanner(System.in);*/
/*		System.out.println("年齢を入力してください");*/
		
		int age = 23;
		
			if (age <= 12) {
				System.out.println ("入場料は無料です");
			} else if (age <= 59) {
				System.out.println ("入場料は500円です");
			} else {
				System.out.println ("入場料は1000円です");
			}
	}

}
