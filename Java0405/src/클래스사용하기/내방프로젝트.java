package 클래스사용하기;

import 클래스만들기.강아지;
// class의 위치를 지정
import 클래스만들기.전화기;

public class 내방프로젝트 {

	public static void main(String[] args) {
		// 전화기 한대 넣기
		전화기 p1 = new 전화기();
		// p1은 참조형 변수(주소)
		// System.out.println(p1);
		p1.size = 11;
		p1.speaker = "바나나사";
		
		System.out.println(p1.size);
		System.out.println(p1.speaker);
		p1.통화하다();
		p1.사진을찍다();
		System.out.println("===============");

		// 전화기 1대 추가
		전화기 p2 = new 전화기();
		// 전화기의 속성, 기능써보기
		p2.size = 33;
		p2.speaker = "사과사";
		p2.사진을찍다();
		p2.통화하다();
		System.out.println(p2.size);
		System.out.println(p2.speaker);
		System.out.println("===============");

		// 강아지 1마리 가져다 놓기
		강아지 dog = new 강아지();
		// 강아지의 속성, 기능 동작
		dog.age = 4;
		dog.sp = "이탈리안 그레이하운드";
		dog.꼬리를흔들다();
		dog.짖다();
		System.out.println(dog.age + "살");
		System.out.println(dog.sp);
		
		
		for (int i = 0; i < 5; i++) {
			dog.꼬리를흔들다();
			dog.짖다();
		}

	}

}
// 내방프로젝트 입니다.