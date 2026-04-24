package jp.co.aforce.sample;

public class Taiyaki {
	String filling;
	
	public void setFilling(String value) {
		filling = value;
	}
	
	public void showFilling() {
		System.out.println("このたい焼きの中身は：" + filling + "です。");
	}
	
	public static void main (String[] args) {
		Taiyaki one = new Taiyaki();
		Taiyaki two = new Taiyaki();
		
		one.setFilling("あんこ");
		two.setFilling("クリーム");
		
		one.showFilling();
		two.showFilling();
	}
	

}
