package 상속활용;

import javax.swing.JOptionPane;

public class 스레드1호기 extends Thread {
	@Override
	public void run() {
		for (int i = 10; i >= 0; i--) {
			System.out.println("count : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (i == 0) {
				JOptionPane.showMessageDialog(null, "마지막 이미지 입니다.");
			}
		}
		
	}
}
