package com.example.utils;

import java.util.*;

//import java.util.ArrayList;
//import java.util.Random;

public class Wildcard {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		Random rand = new Random();
		
		for (int i = 0; i < 5; i++) {
			int num = rand.nextInt(100);
			list.add(num);
		}
		
		for (int n : list) {
			System.out.println(n);
		}
	}

}
