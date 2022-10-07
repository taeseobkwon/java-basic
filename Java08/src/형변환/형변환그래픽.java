package 형변환;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 형변환그래픽 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(300, 300);
		f.setLayout(new FlowLayout());
		JButton b = new JButton("나는 버튼");
		JTextField t = new JTextField("나는 텍스트 필드");
		JCheckBox c = new JCheckBox("나는 체크 박스");

		f.add(b); // component <---- JButton
		f.add(c); // component <---- JCheckbox
		f.add(t); // component <---- JTextfield

		f.setVisible(true);

	}

}
