package 형변환;

import java.util.ArrayList;

public class 나에대한데이터 {

	public static void main(String[] args) {
		ArrayList me = new ArrayList();
		me.add(1000); // Object <- 자동형변환 <- Integer <- auto boxing <- int
		me.add(189.1); 
		me.add(false);
		me.add('남');
		System.out.println(me.size());
		System.out.println(me);
		int money = (int)me.get(0) + 1000; // int <- auto unboxing <- Integer <- 강제형변환 - Object
		double height =  (double)me.get(1) + 10; 
		boolean morning = (boolean)me.get(2);
		char gender = (char)me.get(3);
		
		System.out.println("돈은 " + money + "원 있어요.");
		System.out.println("키는 " + height + "cm에요.");
		if (morning == false) {
			System.out.println("배고파요.");
		} else {System.out.println("배불러요.");

		}
		if (gender == '남') {
			System.out.println("주민번호는 1,3이에요.");
		} else { System.out.println("주민번호는 2,4에요");

		}
	}

}
