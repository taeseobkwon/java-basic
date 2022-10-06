package 스레드;

public class 배열스레드 extends Thread {
	@Override
	public void run() {
		String[] s = {"커피", "물", "과자", "치킨", "우동"};
		for (int i = 0; i < s.length; i++) {
			System.out.println("음식이름>> " + s[i]);
		}
		}
	
	
	}
	
	

