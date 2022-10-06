package 상속활용;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

public class 그래픽메서드활용 extends JFrame {
	JLabel count, image;
	스레드1호기1 th01 = new 스레드1호기1();
	스레드2호기1 th02 = new 스레드2호기1();
	
	public 그래픽메서드활용() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setSize(800, 800);
		count = new JLabel("카운트"); 
		count.setHorizontalAlignment(SwingConstants.CENTER);
		image = new JLabel("");
		image.setHorizontalAlignment(SwingConstants.CENTER);
		add(count, BorderLayout.NORTH);
		add(image, BorderLayout.CENTER);
		setVisible(true);
		th01.start();
		th02.start();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			그래픽메서드활용 f = new 그래픽메서드활용();
	}
	public class 스레드1호기1 extends Thread {
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				// System.out.println("count : " + i);
				count.setText("count : " + i);
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
	public class 스레드2호기1 extends Thread {
		@Override
		public void run() {
			String[] list = {"1호.png","2호.png","3호.png","4호.png","5호.png"};
			for (int i = 0; i < list.length; i++) {
				ImageIcon icon = new ImageIcon(list[i]);
				image.setIcon(icon);
				// System.out.println("이미지" + list[i]);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		
		
		}
	}

}
