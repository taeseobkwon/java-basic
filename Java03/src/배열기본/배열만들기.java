package 배열기본;

public class 배열만들기 {

	public static void main(String[] args) {
		// 배열을 생성할 때, 값을 이미 알고 있는 경우
		int[] s = { 1, 2, 3, 4, 5, 6, 7 };
		// 변수의 개수 ==> 9
		System.out.println(s); // s에 저장된 주소
		System.out.println(s[0]); // 1번째 값
		System.out.println(s[2]); // 3번째 값
		System.out.println(s[5]); // 6번째 값
		System.out.println(s.length); //s길이
		
		
		
		
		// 배열을 생성할 때, 값을 이미 알고 있는 경우
		int[] s2 = new int[5];
		// 변수의 개수 ==> 7
		System.out.println(s2); // s2에 저장된 주소
		System.out.println(s.length); // s2길이
		System.out.println(s2[0]); //쓰레기 값이 있는 경우 빈 공간을 여러 개 만들 때, 자동으로 초기화  int -> 0, double -> 0.0, boolean -> false
		
		s2[0] = 100;
		s2[1] = 200;
		s2[2] = 300;
		s2[s2.length - 1] = 500;
		// 마지막 값에 500대입
		
		System.out.println(s2[0]);
	}

}
