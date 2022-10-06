package 스레드;

public class 동시프로그램실행2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread01 t01 = new Thread01();
		Thread02 t02 = new Thread02();
		Thread03 t03 = new Thread03();

		t01.start();
		t02.start();
		t03.start();

	}

}
