package 컬렉션;

import java.util.HashMap;

public class 맵확인문제 {

	public static void main(String[] args) {
		HashMap cus = new HashMap();
		cus.put(100, "김데이");
		cus.put(200, "김사전");
		cus.put(300, "김구조");
		cus.put(400, "김자료");
		System.out.println(cus);
		cus.remove(200);
		cus.replace(300, "김충성");
		System.out.println(cus);
	}

}
