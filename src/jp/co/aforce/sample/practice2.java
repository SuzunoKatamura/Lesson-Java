package jp.co.aforce.sample;

public class practice2 {
	
	public static void main(String[] args) {
		q4();
	    q5();
	    q6();
	    q7();
	    q8();
	    q9();
	    q10();
	    q11();
	    q12();
	    q13();
	    q14();
	    q15();
	    q16();
	  }
	
	static void q4() {
	    double num = 4.5;
	    double result = num / 2;
	    
	    System.out.println(result);
	  }
	
	static void q5() {
	    double num = 7.8;
	   
        int integerPart = (int) num;           // 整数部分
        double decimalPart = num - integerPart; // 小数部分
        
        System.out.println("整数部分: " + integerPart);
        System.out.println("小数部分: " + decimalPart);
	  }
	
	static void q6() {
	    double num = 3.2;
	    double result = num * 10;
	    
	    System.out.println(result);
	  }
	
	static void q7() {
	    int num = 0;
	    boolean isZero = (num == 0);
	    
	    System.out.println(isZero);
	  }
	
	static void q8() {
	    int num = -5;
	    boolean isNegative = (num < 0);
	    
	    System.out.println(isNegative);
	  }
	
	static void q9() {
	    int num = 15;
	    boolean isMultiple = (num % 5 == 0);
	    
	    System.out.println(isMultiple);
	  }
	
	static void q10() {
	    int num1 = 8;
	    int num2 = 3;
	    int result = num1 + num2;
	    
	    System.out.println(result);
	  }
	
	static void q11() {
	    int num3 = 10;
	    int num4 = 4;
	    int result = num3 - num4;
	    
	    System.out.println(result);
	  }
	
	static void q12() {
	    int num5 = 6;
	    int num6 = 7;
	    int result = num5 * num6;
	    
	    System.out.println(result);
	  }
	
	static void q13() {
	    String name = "Suzuno Katamura";
	    int age = 23;
	    
	    age = age  + 1;
	    
	    System.out.println(name + "は次の誕生日で" + age + "歳です。");
	  }
	
	static void q14() {
	    int num7 = 8;
	    int num8  = 3;
	    
        System.out.println("足し算: " + (num7 + num8));
        System.out.println("引き算: " + (num7 - num8));
        System.out.println("掛け算: " + (num7 * num8));
        System.out.println("割り算: " + (num7 / num8));
        System.out.println("余り: " + (num7 % num8));
	  }
	
	static void q15() {
	    int test1 = 75;
	    int test2 = 88;
	    int test3 = 92;
	    
	    int sum = test1 + test2  + test3;
	    int average = sum / 3;
	    
	    System.out.println("sum:" + sum);
	    System.out.println("average:" + average);
	  }
	
	static void q16() {
	    int price = 12000;
	    
	    double discountedPrice = price * 0.7;
	    
	    System.out.println(discountedPrice + "円");
	  }

}
