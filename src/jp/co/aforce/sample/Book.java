package jp.co.aforce.sample;

public class Book {
	String title;
	String author;
	int price;
	
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.price = 7700;
	}
	
    void showInfo() {
        System.out.println("タイトル: " + title);
        System.out.println("著者: " + author);
        System.out.println("価格: " + price);
    }

}
