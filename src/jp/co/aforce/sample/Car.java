package jp.co.aforce.sample;

public class Car {
	String model;
	int speed;
	
	public void model() {
		System.out.println(model);
	}
	
	public void speed(int value) {
		speed = value;
		System.out.println(speed);
	}
	
	public static void main (String[] args) {
		Car Premacy = new Car();
		Car CX5 = new Car();
		
		Premacy.model();
		Premacy.speed(50);
		CX5.model();
		CX5.speed(60);
	}

}
