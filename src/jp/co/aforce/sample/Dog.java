package jp.co.aforce.sample;

public class Dog {
	String name;
	
	void name() {
		System.out.println("犬の名前は" + name + "です。");
	}
	
	public static void main(String[] args) {
		Dog Pochi = new Dog();
		
		Pochi.name();
	}

	public void bark() {
		// TODO 自動生成されたメソッド・スタブ
		
	}

}
