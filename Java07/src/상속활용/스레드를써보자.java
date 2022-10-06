package 상속활용;

public class 스레드를써보자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		스레드1호기 th1 = new 스레드1호기();
		스레드2호기 th2 = new 스레드2호기();
		
		th1.start();
		th2.start();
	}

}
