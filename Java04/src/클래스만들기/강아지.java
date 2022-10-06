package 클래스만들기;

public class 강아지 {
	// 공통성질(속성) : 나이, 견종
	// 멤버변수
	public int age; // 자동초기화 ""
	public String sp; // 자동초기화 ""

	// 동작(기능) : 꼬리를 흔들다, 짖다
	public void 꼬리를흔들다() {
		System.out.println("강아지가 꼬리를 흔들다.");
	}

	public void 짖다() {
		System.out.println("강아지가 멍멍짖다.");
	}
}
