package jp.co.aforce.practice;

import java.util.ArrayList;
import java.util.Collections;

public class PracticeTest3 {
	public static void main(String[] args) {
        q1q2();
        q3q5();
        q6q7();
	}
	
    public static void q1q2() {
    	
        String[] products = {
        		"シャープペン",
        		"ボールペン",
        		"リングノート",
        		"クリップ",
        		"消しゴム"	
        };
        
        System.out.println(products[2]);
    }
    
    public static void q3q5() {
        ArrayList<String> employees = new ArrayList<>();

        employees.add("山田太郎");
        employees.add("鈴木花子");
        employees.add("佐藤二郎");
        employees.add("山田太郎");
        employees.add("高橋三郎");
        
        for (String name : employees) {
        	System.out.println(employees.get(2));
        }       
    }
    

    public static void q6q7() {
    	
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(15);
        list1.add(16);
        list1.add(19);
        
        
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(12);
        list2.add(18);
        list2.add(20);
        
        
        ArrayList<Integer> merged = new ArrayList<>();
        merged.addAll(list1);
        merged.addAll(list2);
        
        Collections.sort(merged);
        
        for (int num : merged) {
        	 System.out.println(num);
        	 
        	 
             ArrayList<Integer> list3 = new ArrayList<>();
             list3.add(13);
             list3.add(14);
             list3.add(17);
             list3.add(21);
             
             Collections.sort(list3);
             for (int num1 : list3) {
            	 System.out.println(num1);
             }
        }
       
    }
   

}
