package 정적static;

import java.io.ObjectInputStream.GetField;

public class 나의일지 {

	public static void main(String[] args) {
		// 변수는 선언된 위치를 포함한 괄호안에서만 사용가능
		// day1, day2, day3는 메서드 안에서만 쓸 수 있음
		// main안에서만 쓸 수 있는 지역변수(local 변수)
		// 지역변수 <---> 전역변수
		// 지역변수는 자동초기화X
		// 지역변수는 프로그래머가 초기화시켜야 한다
		
		Day day1 = new Day("운동", 4, "공원");
		System.out.println(day1); // 주소대신 toString이 찍힘. instance
		System.out.println(Day.count); // static
		System.out.println("누적시간은 " + Day.timecount + "시간");
		// System.out.println("평균시간은 " + Day.avcount + "시간");
		System.out.println();
		
		Day day2 = new Day("토익공부", 8, "도서관");
		System.out.println(day2); // 주소대신 toString이 찍힘.
		System.out.println(Day.count);
		System.out.println("누적시간은 " + Day.timecount + "시간");
		// System.out.println("평균시간은 " + Day.avcount + "시간");
		System.out.println();
		
		Day day3 = new Day("영화보기", 2, "영화관");
		System.out.println(day3); // 주소대신 toString이 찍힘.
		System.out.println(Day.count);
		System.out.println("누적시간은 " + Day.timecount + "시간");
		// System.out.println("평균시간은 " + Day.avcount + "시간");
		System.out.println("평균시간은 " + Day.getAvg() + "시간");
		
		
	}

}
