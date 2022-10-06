package 정적static;

public class Day {
	// 객체생성시, 힙영역에 복사될 변수들(인스턴스 변수)
	// 변수들에 해당 실제값이 들어감(실제변수, 인스턴스변수)
	String doing;
	int time;
	String location;
	static int count; //전역변수는 자동초기화, static은 객체간 공유할 목적으로 만듦
	static int timecount;
	// static double avcount;
	
	
	// 객체생성시, 3개 데이터 반드시 넣어서 객체생성하세요
	public Day(String doing, int time, String location) {
		count++;
		this.doing = doing;
		this.time = time;
		this.location = location;
		// timecount = timecount + time;
		timecount += time;
		// avcount = timecount / count;
		
	}
	// 일반메서드는 객체생성후, "주소로 접근"해서 호출해야한다
	// 일반메서드는 객체생성후, 호출(사용)할 수 있다.
	// 평균을 객세생성과 상관없이 아무때나 구하고 싶다. --> 일반메서드 X
	// 객체생성과 상관없이 기능을 정의하고 싶으면 static으로 만들어야 함
	
	public static double getAvg() {
		// static메서드안에 들어가는 전역변수는
		// 객체생성하지 않아도 접근가능해야 하므로
		// static변수만 가능
		return timecount / (double)count;
	}
	// 객체생성후, 생성된 객체의 주소가 아닌 
	// 그 주소가 가르키는 인스턴스변수의 값들을 가지고 String으로 만들어라
	@Override
	public String toString() {
		return "나의 하루 [하는일=" + doing + ", 한 시간=" + time + ", 위치=" + location + "]";
	}
	
	
	
	
}
