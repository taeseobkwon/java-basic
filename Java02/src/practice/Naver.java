package practice;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;

public class Naver {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 0));
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디 :");
		lblNewLabel.setBounds(43, 65, 144, 51);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호 :");
		lblNewLabel_1.setBounds(43, 145, 144, 51);
		f.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(119, 80, 180, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 255, 0));
		t2.setColumns(10);
		t2.setBounds(119, 160, 180, 21);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("로그인 확인");
		btnNewButton.setBounds(50, 219, 103, 39);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("지우기");
		btnNewButton_1.setBounds(183, 219, 103, 39);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
	}
}
