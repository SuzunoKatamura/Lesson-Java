package jp.co.aforce.sample;

public class Robot {
	String name;
	
	public Robot(String name) {
		this.name = name;
	}
	
	public void moveRight() {
		System.out.println(name + "は右に移動しています");
	}
	public void moveLeft() {
		System.out.println(name + "は左に移動しています");
	}
	
	public static void main(String[] args) {
		Robot one = new Robot("Robot1");
		Robot two = new Robot("Robot2");
		
		one.moveRight();
		two.moveLeft();
		
	}

}
