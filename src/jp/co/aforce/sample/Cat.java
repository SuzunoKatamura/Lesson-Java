package jp.co.aforce.sample;

public class Cat {
	String name;
	
	void meow() {
		System.out.println(name + "が鳴いた!");
	}
	
	public static void main(String[] args) {
		// ここにインスタンス化コードを記述
		Cat Tama = new Cat();
		
		Tama.meow();
	}

}
