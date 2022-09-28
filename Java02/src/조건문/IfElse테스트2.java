package 조건문;

public class IfElse테스트2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int jumsu = 88;
		// 변수 선언할 때, 변수가 생성
		// result안에는 쓰레기 값이 들어있다
		// 연산자, 출력 x

		String result = ""; // 초기화
		// 변수를 선언할 때는 초기값을 넣어야 한다.

		if (jumsu >= 90) {
			result = "A학점";
		} else if (jumsu >= 85 && jumsu < 90) {
			result = "B+학점";
		} else if (jumsu >= 80 && jumsu < 85) {
			result = "B+학점";
		}
		  else if (jumsu >= 70) {
			result = "C학점";
		} else if (jumsu >= 60) {
			result = "D학점";
		}
		System.out.println("당신의 학점은 " + result);

	}

}
