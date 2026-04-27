package jp.co.aforce.practice;

public class PracticeTest2 {
	public static void main(String[] args) {
        q1();
        q2q4();
        q3();
	}
        
        
        public static void q1() {
        	double TAX = 0.08; 
        	System.out.println("消費税率は" + TAX);
        }
        
        public static void q2q4() {
        	double TAX = 0.08; 
        	int x = 480; 
        	double price = x + x * TAX;
        	String thisPrice = "商品の税込みの値段は";
        	String is = "円です"; 
        	
        	System.out.println(price);
        	System.out.println(thisPrice + price + is);
        	
        }
        
        public static void q3() {
        	String name = "Suzuno"; 
        	System.out.println("私の名前は" + name);
        }

}
