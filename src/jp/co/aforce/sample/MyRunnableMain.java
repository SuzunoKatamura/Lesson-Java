package jp.co.aforce.sample;

public class MyRunnableMain {
	public static void main(String[] args) {
		Thread t1 = new Thread(new MyRunnable());
		t1.start();
		System.out.println("メインスレッドを終了します");
	}

}
