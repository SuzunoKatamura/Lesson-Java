package jp.co.aforce.sample;

import java.util.Scanner;

public class practice1 {
	
	  public static void main(String[] args) {
	    q1();
	    q2();
	    q3();
	    q4();
	    q5();
	    q6();
	    q7();
	   	  
	  }
	
		  static void q1() {
		    int num = 10;
		    System.out.println(num);
		  }
		
		  static void q2() {
		    int a = 8;
		    int b = 5;
		    int sum = a + b;
		    System.out.println(sum);
		  }
		
		  static void q3() {
		    int width = 7;
		    int height = 4;
		    int area = width * height / 2;
		    System.out.println(area);
		  }
		  
		  static void q4() {
			    String name = "Java";
			    double version = 17.0;
			    boolean isFun = true;
			    System.out.println(name + " " + version + " " + isFun);
			  }
		  
		  static void q5() {
			    Scanner scanner = new Scanner(System.in);

			    System.out.print("名前を入力してください：");
			    String name = scanner.nextLine();

			    System.out.println("こんにちは, " + name + " さん！");

			    scanner.close();
			  }		  
		  
		  static void q6() {
			    Scanner scanner = new Scanner(System.in);

			    System.out.print("名前を入力してください：");
			    String name = scanner.nextLine();

			    System.out.print("年齢を入力してください：");
			    int age = scanner.nextInt();
			    scanner.nextLine(); // ← 改行を消す（これ大事）

			    System.out.print("誕生日を入力してください（例: 1995-05-15）：");
			    String birthday = scanner.nextLine();

			    String result = String.format(
			      "名前: %s, 年齢: %d歳, 誕生日: %s",
			      name, age, birthday
			    );

			    System.out.println(result);

			    scanner.close();
			  }		  
		  
		  static void q7() {
			    int laptopPrice = 1200;
			    
			    System.out.println("商品：Laptopは、価格：" + laptopPrice + "なので、３個買うと" + (laptopPrice * 3) + "円です。");
			  }
		  
		  
}