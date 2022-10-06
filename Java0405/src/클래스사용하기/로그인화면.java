package 클래스사용하기;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 로그인화면 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 255, 0));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java04\\diary.PNG"));
		lblNewLabel.setBounds(56, 10, 321, 197);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("아이디:");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1.setBounds(94, 229, 74, 25);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("비밀번호:");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_1_1.setBounds(94, 262, 85, 25);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t1 = new JTextField();
		t1.setBounds(191, 231, 116, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(191, 264, 116, 21);
		f.getContentPane().add(t2);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText(); // id
				String s2 = t2.getText(); // pw
				
				// id = "root", pw = "1234"이면 일기쓰기 화면띄우고
				// 아니면 joptionpane으로 "입력값이 달라서 로그인 실패입니다."
				// 일기쓰기 새 창을 띄우기
				
				if (s1.equals("root") && s2.equals("1234")) {
					일기쓰기 diary = new 일기쓰기();
					diary.open();
					
				} else {
					JOptionPane.showMessageDialog(f, "입력값이 달라서 로그인 실패입니다.");
				}
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java04\\go1.PNG"));
		btnNewButton.setBounds(77, 329, 97, 91);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1, t2의 글자를 지워지는 것처럼 공백으로 만들기
				t1.setText("");
				t2.setText("");
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java04\\reset.PNG"));
		btnNewButton_1.setBounds(231, 329, 97, 91);
		f.getContentPane().add(btnNewButton_1);
		f.setVisible(true);
		
		
	}
}
