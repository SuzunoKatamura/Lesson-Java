package com.example.utils;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList<String>list = new ArrayList<>();
			list.add("apple");
			list.add("orange");
			list.add("banana");
		
		for (String item : list) {
			System.out.println(item);
		}
	}

}
