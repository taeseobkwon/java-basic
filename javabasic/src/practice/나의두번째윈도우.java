package practice;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ImageIcon;

public class 나의두번째윈도우 {

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(230, 255, 255));
		f.setSize(500,500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("이름");
		lblNewLabel.setFont(new Font("배달의민족 주아", Font.BOLD, 20));
		lblNewLabel.setBounds(49, 21, 53, 46);
		f.getContentPane().add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(131, 34, 317, 24);
		f.getContentPane().add(textArea);
		
		JLabel lblNewLabel_1 = new JLabel("전화번호");
		lblNewLabel_1.setFont(new Font("배달의민족 주아", Font.BOLD, 20));
		lblNewLabel_1.setBounds(49, 101, 83, 46);
		f.getContentPane().add(lblNewLabel_1);
		
		JTextArea textArea_1 = new JTextArea();
		textArea_1.setBounds(131, 114, 317, 24);
		f.getContentPane().add(textArea_1);
		
		JLabel lblNewLabel_2 = new JLabel("주소");
		lblNewLabel_2.setFont(new Font("배달의민족 주아", Font.BOLD, 20));
		lblNewLabel_2.setBounds(49, 186, 53, 46);
		f.getContentPane().add(lblNewLabel_2);
		
		JTextArea textArea_2 = new JTextArea();
		textArea_2.setBounds(131, 199, 317, 24);
		f.getContentPane().add(textArea_2);
		
		JButton btnNewButton = new JButton("확인");
		btnNewButton.setBounds(115, 401, 83, 37);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("취소");
		btnNewButton_1.setBounds(311, 401, 83, 37);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\javabasic\\04.jpg"));
		btnNewButton_2.setBounds(49, 254, 393, 119);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
