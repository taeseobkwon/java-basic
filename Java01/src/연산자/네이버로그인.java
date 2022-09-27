package 연산자;

public class 네이버로그인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 기본형 여러개 비교
		// 가입했을 떄의 id, pw
		// db에 저장되어 있는 값을 db에서 꺼내와야 함
		int id = 1111;
		int pw = 2222;
		
		// 입력한 id, pw
		int id2 = 1111;
		int pw2 = 3333;
		
		// 논리연산자 (&&)
		
		// 조건이 맞을 때, 맞지 않을 때 다르게 처리하고자 하는 경우 (if)
		// if(조건) : 조건은 비교하는 것을 써야함 (true/false)
		// 문법으로 쓰려고 미리 만들어 놓은 단어들(예약어)은 이름으로 사용할 수 없다.
		// 기본형은 연산자를 이용해서 비교 가능
		// else는 () 쓰지 않음
		if (id == id2 && pw==pw2) {
			System.out.println("로그인 성공");
		} else {System.out.println("로그인 실패");

		}
	}

}
