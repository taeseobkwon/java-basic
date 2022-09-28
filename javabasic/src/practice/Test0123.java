package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Test0123 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("뭐 먹?");
		lblNewLabel.setBounds(51, 64, 86, 47);
		f.getContentPane().add(lblNewLabel);
		
		t1 = new JTextField();
		t1.setBounds(161, 77, 286, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("올해 나이");
		lblNewLabel_1.setBounds(51, 162, 86, 47);
		f.getContentPane().add(lblNewLabel_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(161, 175, 286, 21);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_2 = new JLabel("국어점수");
		lblNewLabel_2.setBounds(51, 270, 86, 47);
		f.getContentPane().add(lblNewLabel_2);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(161, 283, 286, 21);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_3 = new JLabel("수학점수");
		lblNewLabel_3.setBounds(51, 368, 86, 47);
		f.getContentPane().add(lblNewLabel_3);
		
		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(161, 381, 286, 21);
		f.getContentPane().add(t4);
		
		JButton btnNewButton = new JButton("어디로 갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			String s1 = t1.getText();
			if (s1.equals("돈가스") || s1.equals("라면") || s1.equals("국밥")) {
				JOptionPane.showMessageDialog(f, "그걸로 하자");
			} else { JOptionPane.showMessageDialog(f, "그건 싫은데");

			}
				
			}
		});
		btnNewButton.setBounds(182, 115, 97, 23);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("내년?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s2 = t2.getText();
			int age  = Integer.parseInt(s2);
			
			JOptionPane.showMessageDialog(f, "내년 나이는 " + (age + 1) + "살");
			}
		});
		btnNewButton_1.setBounds(182, 221, 97, 23);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("평균?");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String s3 = t3.getText();
			String s4 = t4.getText();
			
			int s33 = Integer.parseInt(s3);
			int s44 = Integer.parseInt(s4);
			double av = (s33 + s44) / 2.0;
			
			
			JOptionPane.showMessageDialog(f, "두 과목의 평균은 " + av);
				
			}
		});
		btnNewButton_2.setBounds(182, 412, 97, 23);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
		
	}

}
