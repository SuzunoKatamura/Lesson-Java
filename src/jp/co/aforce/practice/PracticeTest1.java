package jp.co.aforce.practice;

public class PracticeTest1 {

    public static void main(String[] args) {

        q2();
        q3();
        q4q5();
        q7();
        

        int total = 13 + 17;
        int sum = total + NUMBER;

        System.out.println("sum=" + sum);
    }

    public static void q2() {
        System.out.println("Hello World");
    }

    public static void q3() {
        int x = 11;
        System.out.println("x=" + x);
    }

    public static void q4q5() {
        int y = 13;
        int z = 17;
        int total = y + z;

        System.out.println("y=" + y + " z=" + z);
        System.out.println(total);
    }
    
    public static final int NUMBER = 6;
    
    public static void q7() {
    	int total = 13 + 17;
		int sum = total + NUMBER;
    	
    	System.out.println(sum);
    }
}
