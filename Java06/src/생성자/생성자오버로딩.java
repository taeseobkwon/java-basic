package 생성자;

import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 생성자오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		JFrame f2 = new JFrame("나는 제목");
		
		JButton	b = new JButton();
		JButton b2 = new JButton("나는 버튼 글자"); // 참조형 변수(주소)
		
		Font font = new Font("궁서", 1, 50); // 글자를 나타내는 부품
		b2.setFont(font); //font는 참조형 변수(주소), b2.setfont(주소)
		f2.setSize(300, 300);
		f2.add(b2); //f2.add(주소)
		f2.setVisible(true);
	}

}
