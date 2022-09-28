package practice;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class Calculator2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(700, 700);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("숫자1");
		lblNewLabel.setBounds(91, 275, 61, 57);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("숫자2");
		lblNewLabel_1.setBounds(91, 334, 61, 57);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton plus = new JButton("+");
		plus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// plus버튼을 눌렀을 때 처리하고 싶은 내용을 넣는다.
				JOptionPane.showMessageDialog(f, "plus버튼을 누르셨군요");
				//1. 두수를 가지고 오세요.(String)
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				//2. 숫자로 바꿔서 정수변수에 넣는다
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				//3. 결과출력
				// JOptionPane.showMessageDialog(f, n11 + n22);
				// f.setTitle("더한 결과는 " + (n11 + n22));
				JOptionPane.showMessageDialog(t3, n11 + n22);
				
				// result.setText("더한 결과는" + (n11 + n22));
				t1.setText("");
				t2.setText("");
			}
		});
		plus.setBounds(91, 382, 70, 51);
		f.getContentPane().add(plus);
		
		JButton minus = new JButton("-");
		minus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "minus버튼을 누르셨군요");
				String n1 = t1.getText();
				String n2 = t2.getText();
				
				int n11 = Integer.parseInt(n1);
				int n22 = Integer.parseInt(n2);
				
				JOptionPane.showMessageDialog(f, n11 - n22);
			}
		});
		minus.setBounds(181, 382, 70, 51);
		f.getContentPane().add(minus);
		
		JButton mul = new JButton("*");
		mul.setBounds(269, 382, 70, 51);
		f.getContentPane().add(mul);
		
		JButton div = new JButton("/");
		div.setBounds(351, 382, 70, 51);
		f.getContentPane().add(div);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\javabasic\\Math_programming_calc_figure_2_half_column_mobile.jpg"));
		btnNewButton.setBounds(12, 10, 504, 264);
		f.getContentPane().add(btnNewButton);
		
		t1 = new JTextField();
		t1.setBounds(164, 293, 260, 21);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(164, 352, 260, 21);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel_1_1 = new JLabel("결과값");
		lblNewLabel_1_1.setBounds(91, 466, 61, 57);
		f.getContentPane().add(lblNewLabel_1_1);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(164, 484, 260, 21);
		f.getContentPane().add(t3);
		f.setVisible(true);
	}
}
