package jp.co.aforce.sample;

import java.lang.reflect.Method;

public class Sample1Main {
	public static void main(String[] args) {
		Class<?> class1 = Sample.class;

		Method[] methods = class1.getDeclaredMethods();

		for (Method m : methods) {
			System.out.println(m.getName());
		}
	}

}
