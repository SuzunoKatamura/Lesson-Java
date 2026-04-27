package jp.co.aforce.sample;

public class Person {
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	// toStringのオーバーライド
	@Override
	public String toString() {
		return"名前:" + name + "、年齢:" + age;
	}
}
