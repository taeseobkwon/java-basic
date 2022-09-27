package 변수;

public class 기본데이터 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수, 실수, 문자1, 논리
		// ram에 넣어보자
		// 기본데이터는 아닌데 기본데이터처럼 쓰는
		// String
		
		int age = 100; //정수(4, 21억)
		double height = 122.2; //실수(8)
		char gender = '남'; //문자1(2) ==> ('싱글따옴표')
		boolean food = true; //논리(1) ==> true(1)/false(0)
		
		System.out.println("나의 나이는" + age + "살 입니다.");
		System.out.println("나의 키는" + height);
		System.out.println("나의 성별은" + gender);
		System.out.println("나의 식사 여부는" + food);
		
	}

}
