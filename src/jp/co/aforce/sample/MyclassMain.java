package jp.co.aforce.sample;

public class MyclassMain {
	public static void main(String[] args) {
		Class<Myclass> class1 = Myclass.class;
		if (class1.isAnnotationPresent(MyAnnotation.class)) {
			MyAnnotation ann = class1.getAnnotation(MyAnnotation.class);
			System.out.println("アノテーションの値：" + ann.value());
		}
	}

}
