package jp.co.aforce.sample;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("Lucas", 34);
		
		System.out.println("name:" + p1.name);
		System.out.println("age:" + p1.age);
		
		// toStringのオーバーライド
		System.out.println(p1.toString());
		System.out.println(p1);
	}

}
