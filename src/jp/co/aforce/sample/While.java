package jp.co.aforce.sample;

import java.util.ArrayList;

public class While {
	
	public static void main(String[] args) {
		
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int sum = 0;
		while (i <= 100) {
			sum += i;
			i++;
		}
		System.out.println(sum);
		
		
		int a = 1;
		int sum1 = 0;
		while (a <= 12) {
			sum1 += a;
			a++;
		}
		System.out.println(sum1);
		
		int b = 1;
		
			do {
				System.out.println(b);
				b++;
			} while  (b <= 10);
		
		int c = 1;
		int sumC = 0;
			do {
				sumC += c;
				c++;
			} while (c <= 100);
			System.out.println(sumC);
		
		int d = 12;
		int sumD = 0;
			do {
				sumD += d;
			} while (sumD != 0);
			System.out.println(sumD);
			
			
		for (int e = 1; e <= 10; e++) {
			System.out.println(e);
		}
		
		
		int sumF = 0;
			for (int f = 1; f <= 100; f++) {
				sumF += f;
			}
			System.out.println(sumF);
			
			
			
		int g = 1;
		int h = 1;
			for (int j = 1; j <= 10; j++) {
				System.out.println(g);
				
				int next = g + h;
				g = h;
				h = next;
			}
			
			
		int[] numbers = {1, 2, 3, 4, 5};
			for (int n : numbers) {
				System.out.println(n);
			}
		
		ArrayList<String>list = new ArrayList<>();
			list.add("apple");
			list.add("orange");
			list.add("banana");
				for (String s : list) {
					System.out.println(s);
				}
				
				
				
		 int[] numbers1 = {1, 2, 3, 4, 5};
		 int sum11 = 0;
		 	for (int num : numbers1) {
		 		sum11 += num;
		    }
		    System.out.println(sum11);
		
		
		for (int k = 1; k <= 10; k++) {
				if (k == 5) {
				break;
				}
				System.out.println(k);
			}
		
		int[] numbers11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
			for (int n : numbers11) {
				if (n ==7) {
					break;
			}
				System.out.println(n);
			}
			
			
			
		int[][] numbers111 = {
				{1, 2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		outer:
			for (int l = 0; l < numbers111.length; l++) {
				for (int m = 0; m < numbers111[l].length; m++) {
				if (numbers111[l][m] == 5) {
					break outer;
				}
				System.out.println(numbers111[l][m]);
				}
			}
		
	}

}
