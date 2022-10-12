package 추상클래스인터페이스;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 인터페이스그래픽2 implements ActionListener{
	static TextArea t1;
	static JButton b1, b2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 500);
		f.setLayout(new FlowLayout());

		b1 = new JButton("나를 눌러요.");
		b2 = new JButton("나도 눌러요.");
		f.add(b1);
		f.add(b2);

		Font font = new Font("궁서", Font.BOLD, 50);
		b1.setFont(font);
		b2.setFont(font);

		t1 = new TextArea(6, 13);
		t1.setFont(font);
		f.add(t1);

		인터페이스그래픽2 b3 = new 인터페이스그래픽2();
		b1.addActionListener(b3);
		b2.addActionListener(b3);

		f.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) { // e.getSource == 주소를 가져다 줌
			t1.append("b1을 클릭함.\n"); // append : 쌓음
		}
		if (e.getSource() == b2) {
			t1.append("b2을 클릭함.\n");
			
		}
	}
	
	
}
