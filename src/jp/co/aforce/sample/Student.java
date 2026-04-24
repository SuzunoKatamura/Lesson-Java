package jp.co.aforce.sample;

public class Student {
	String name;
	int[] score;
	
	public Student(String name, int[] scores) {
        this.name = name;
        this.score = scores;
    }
	
	public int getTotal() {
        int sum = 0;
        for (int score : score) {
            sum += score;
        }
        return sum;
    }

	public double getAverage() {
        return (double) getTotal() / score.length;
    }

    public void showResult() {
        System.out.println(name + "の合計: " + getTotal());
        System.out.println(name + "の平均: " + getAverage());
    }
    
	
	public static void main (String[] args) {
		Student Lucas = new Student("Lucas", new int[]{80, 90, 70});
		Student Bellen = new Student("Bellen", new int[]{60, 75, 85});
		
		Lucas.showResult();
		Bellen.showResult();
		System.out.println("----");
	}

}
