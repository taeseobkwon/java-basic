package 생성자;

public class 컴퓨터조립 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		컴퓨터 c1 = new 컴퓨터(1000, "A사", 36.7);
		System.out.println(c1.price);
		System.out.println(c1.make);
		System.out.println(c1.size);
		System.out.println(c1);
		// c1은 주소가 들어있음
		// 컴퓨터 클래스에 toString()을 메서드 생성해주면 주소를 프린트할 떄 toString()메서드가
		// 자동호출되어 return한 스트링을 주소대신에 프린트해준다.
		// 주소가 가르키는 힙영역의 멤버변수값들을 프린트
		System.out.println();
		컴퓨터 c2 = new 컴퓨터(2000, "B사", 40.7);
		System.out.println(c2.price);
		System.out.println(c2.make);
		System.out.println(c2.size);
		System.out.println(c2);
	}

}
