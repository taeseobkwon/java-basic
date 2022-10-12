package 추상클래스인터페이스;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 인터페이스그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("이벤트를 인터페이스로 처리");
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());

		JButton b1 = new JButton("나를 눌러요.");
		JButton b2 = new JButton("나도 눌러요.");
		f.add(b1); // 업캐스팅(자동형변환)
		f.add(b2); // 업캐스팅(자동형변환)
		
		버튼1처리클래스 버튼1처리 = new 버튼1처리클래스();
		b1.addActionListener(버튼1처리); //Listener : 처리
		버튼2처리클래스 버튼2처리 = new 버튼2처리클래스();
		b2.addActionListener(버튼2처리);

		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);

		TextArea t1 = new TextArea(6, 13);
		t1.setFont(font);
		f.add(t1);
		t1.setBackground(Color.CYAN);

		f.setVisible(true);
	}
		
	
}
