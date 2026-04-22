package jp.co.aforce.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;

public class practice3 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

	        list.add(1);
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        list.add(5);

        // 逆順で表示
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }

        // HashSetに変換（重複削除）
        HashSet<Integer> set = new HashSet<>(list);

        for (int num : set) {
            System.out.println(num);
        }

        // containsのチェック
        int target = 2;
        boolean exists = list.contains(target);
        System.out.println(exists);
        
        
        ArrayList<String> strList = new ArrayList<>();

	        strList.add("a");
	        strList.add("b");
	        strList.add("c");
        
        Collections.sort(list);
        
        for (String s : strList) {
        	System.out.println(s);
        }
        
        
        LinkedList<String> list1 = new LinkedList<>();

	        list1.add("apple");
	        list1.add("banana");
	        list1.add("peach");
	        list1.add("grape");

        System.out.println(list1.getFirst());
        System.out.println(list1.getLast());
        
        
        HashMap<String, Integer> map = new HashMap<>();

	        map.put("apple", 100);
	        map.put("banana", 200);
	        map.put("orange", 150);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        
        String key = "banana";
        Integer value = map.get(key);
        
        System.out.println(key + " : " + value);
        
        
        HashSet<String> set1 = new HashSet<>();

        // 要素追加（重複あり）
        set1.add("Java");
        set1.add("Python");
        set1.add("Java");
        set1.add("Ruby");
        set1.add("Python");

        // 表示
        for (String s : set1) {
            System.out.println(s);
        }

        
    }
}
