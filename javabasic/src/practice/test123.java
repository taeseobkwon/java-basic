package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class test123 {
	/**
	 * @wbp.nonvisual location=100,-1
	 */
	private static final JLabel label = new JLabel("New label");
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 0));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("먹고 싶은 음식");
		lblNewLabel.setBounds(49, 28, 222, 45);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("수학점수");
		lblNewLabel_1.setBounds(49, 264, 100, 45);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("당신의 나이는");
		lblNewLabel_2.setBounds(49, 102, 100, 45);
		f.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("국어점수");
		lblNewLabel_3.setBounds(49, 209, 100, 45);
		f.getContentPane().add(lblNewLabel_3);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 255, 0));
		t1.setBounds(162, 40, 271, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setBackground(new Color(255, 128, 128));
		t2.setColumns(10);
		t2.setBounds(161, 114, 271, 21);
		f.getContentPane().add(t2);
		
		t3 = new JTextField();
		t3.setBackground(new Color(0, 255, 255));
		t3.setColumns(10);
		t3.setBounds(161, 221, 271, 21);
		f.getContentPane().add(t3);
		
		t4 = new JTextField();
		t4.setBackground(new Color(0, 255, 255));
		t4.setColumns(10);
		t4.setBounds(161, 276, 271, 21);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String s1 = t1.getText();
				if (s1.equals("아메리카노") || s1.equals("아이스 아메리카노") || s1.equals("홍차") || s1.equals("커피")) {
					JOptionPane.showMessageDialog(f,"카페 가세요");
					
				} else {JOptionPane.showMessageDialog(f, "물이나 마셔요");

				}
			}
		});
		btnNewButton.setBounds(59, 71, 361, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("나의 내년 나이는");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s2 = t2.getText();
			int age = Integer.parseInt(s2);
			JOptionPane.showMessageDialog(f, "당신의 나이는 " + (age + 1) + "세 입니다.");
			
			}
		});
		btnNewButton_1.setBounds(59, 157, 361, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("두 과목의 평균 점수는");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s3 = t3.getText();
			int s33 = Integer.parseInt(s3);
			String s4 = t4.getText();
			int s44 = Integer.parseInt(s4);
			double av = (s33 + s44) / 2.0;
			
			JOptionPane.showMessageDialog(f, "두 과목의 평균은 " + av + "점");
			
				
				
			}
		});
		btnNewButton_2.setBounds(49, 319, 361, 23);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		
		
	}
}
