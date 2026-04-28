package com.example.utils;

public class PersonMain {
	public static void main(String[] args) {
		Person p = new Person();
		
		p.setName("白布");
		p.setAge(17);
		p.setAddress("宮城");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getAddrss());
	}

}
