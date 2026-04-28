package com.example.utils;

import static java.lang.Math.*;

public class Math {
	public static void main(String[] args) {
		double radius = 5.0;
		double area = PI * radius * radius;
		System.out.println("円の面積は" + area);
		
		
		double result1 = pow(radius, 2);
		double result2 = PI * result1;
		
	System.out.println("円の面積は" + result2);
	}

}
