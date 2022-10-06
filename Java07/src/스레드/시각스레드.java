package 스레드;

import java.util.Date;

public class 시각스레드 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 500; i++) {
			Date date = new Date();
			System.out.println(date);
			// cpu 1초 stop
			// 자바에서 cpu연결
			// 자바에서 외부 자원을 연결할 때는 위험상황
			// 위험 상황 발생(에러발생으로 인한 프로그램 중지)
			// 대응책 코딩
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
