package jp.co.aforce.practice;

public class PracticeTest5 {
	public static void main(String[] args) {
        q1();
        q2();
        q3();
	}
	
    public static void q1() {
    	int fortune = new java.util.Random().nextInt();
    	
    	switch (fortune) {
    		case 1 :
    			System.out.println("吉です");
    			break;
    		case 2 :
    			System.out.println("中吉です");
    			break;
    		case 3 :
    			System.out.println("大吉です");
    			break;
    		default :
    			System.out.println("凶です");
    	}

    }
    
    public static void q2() {
    	String result = "";
    	
    	for (int i = 1; i<= 100; i++) {
    		if (i % 7 == 0) {
    			if (!result.equals("")) {
    				result += ",";
    			}
    			result += i;
    		}
    	}
    	 
    	System.out.println(result);
    }
    
    public static void q3() {
    	 
    	System.out.println();
    }

}
