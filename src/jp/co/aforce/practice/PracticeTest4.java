package jp.co.aforce.practice;

import java.util.ArrayList;

public class PracticeTest4 {
	public static void main(String[] args) {
        q1q2();
        q3();
	}
	
    public static void q1q2() {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("犬");
        animals.add("猫");
        animals.add("うさぎ");
        animals.add("へび");
        
        String favoriteAnimal = "猫";
        
        if (animals.contains(favoriteAnimal)) {
        	System.out.println(favoriteAnimal + "はリストに含まれています");
        } else {
        	System.out.println(favoriteAnimal + "はリストに含まれていません");
        }
    }

    
    public static void q3() {
    	Calender cal = Calender.getInstance();
    	int month = 4;
    	
    	switch (month) {
	    	case 1:
	    		System.out.println("冬物セール");
	    		break;
	    	case 2:
	    		System.out.println("春物を売る");
	    		break;
	    	case 3:
	    		System.out.println("春物を売る");
	    		break;
	    	case 4:
	    		System.out.println("春物を売る");
	    		break;
	    	case 5:
	    		System.out.println("春物セール");
	    		break;
	    	case 6:
	    		System.out.println("夏物を売る");
	    		break;
	    	case 7:
	    		System.out.println("夏物を売る");
	    		break;
	    	case 8:
	    		System.out.println("夏物セール");
	    		break;
	    	case 9:
	    		System.out.println("秋物を売る");
	    		break;
	    	case 10:
	    		System.out.println("冬物を売る");
	    		break;
	    	case 11:
	    		System.out.println("冬物を売る");
	    		break;
	    	case 12:
	    		System.out.println("冬物を売る");
	    		break;
	    	default:
	    		System.out.println("不正な月です");

    	}

    }
    

	
	
	



	
	
	

}
