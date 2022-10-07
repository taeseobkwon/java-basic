package 컬렉션;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class 컬렉션처음 {

	public static void main(String[] args) {
		HashSet list = new HashSet();

		list.add("디자이너");
		list.add("프로그래머");
		list.add("DB관리자");
		list.add("DB관리자");
		list.add("디자이너");
		list.add("디자이너");
		list.add("프로그래머");
		list.add("디자이너");
		list.add("프로그래머");
		list.add("디자이너");
		list.add("DB관리자");
		list.add("디자이너");
		System.out.println(list);
		System.out.println(list.size());
		
		
		//2 . queue -> LinkedList
		LinkedList milk = new LinkedList();
		milk.add("상한우유");
		milk.add("싱싱우유");
		milk.remove();
		System.out.println(milk);
		
		// 3. list -> ArrayList
		ArrayList ski = new ArrayList();
		ski.add("박스키"); //0
		ski.add("송스키"); //1
		ski.add("김스키"); //2
		ski.add("정스키"); //3
		ski.remove(1);
		System.out.println(ski);
		
	}

}
