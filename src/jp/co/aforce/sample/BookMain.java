package jp.co.aforce.sample;

public class BookMain {
	public static void main(String[] args) {
		Book b1 = new Book("怪人二十面相", "江戸川乱歩", 770);
		b1.showInfo();
		
		Book b2 = new Book("スカルプターのための美術解剖学", "アルディス・ザリンス");
		b2.showInfo();
	}

}
