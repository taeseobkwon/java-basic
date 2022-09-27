package practice;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class 나의첫윈도우 {
	private static JTextField textField;

	public static void main(String[] args) {
		// 1. jFrame 부품을 새로 만들어주자
		JFrame f = new JFrame();
		
		// 2. 새로 만든 부품의 크기를 결정
		f.setSize(500, 500);
		
		textField = new JTextField();
		f.getContentPane().add(textField, BorderLayout.SOUTH);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(new Color(230, 255, 255));
		f.getContentPane().add(textArea, BorderLayout.CENTER);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\javabasic\\giphy.gif"));
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JLabel lblNewLabel = new JLabel("New label");
		f.getContentPane().add(lblNewLabel, BorderLayout.WEST);
		
		// 3. 새로 만든 부품을 보여주세요
		f.setVisible(true);
	}

}
