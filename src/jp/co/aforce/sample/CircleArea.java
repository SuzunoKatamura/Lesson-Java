package jp.co.aforce.sample;

public class CircleArea {
	public static double calcArea(double r) {
		return Math.PI *r *r;
	}
	
	public static void main(String[] args) {
		double radius = 5.0;
		double area = calcArea(radius);
		
		System.out.println(area);
	}
}
