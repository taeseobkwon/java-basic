package 정적static;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Counter {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame("나의 카운터 프로그램");
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel t1 = new JLabel("0");
		t1.setForeground(new Color(255, 0, 0));
		t1.setFont(new Font("굴림", Font.BOLD, 150));
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setBounds(84, 85, 329, 297);
		f.getContentPane().add(t1);

		JButton b1 = new JButton("1더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				count++;
				t1.setText(count + "");
			}
		});
		b1.setBackground(new Color(0, 255, 0));
		b1.setBounds(12, 10, 117, 36);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count = 0;
				t1.setText(count + "");
			}
		});
		b2.setForeground(new Color(255, 255, 255));
		b2.setBackground(new Color(0, 0, 160));
		b2.setBounds(166, 10, 128, 36);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("1빼기");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count--;
				t1.setText(count + "");
			}
		});
		b3.setBackground(new Color(0, 255, 0));
		b3.setBounds(327, 10, 117, 36);
		f.getContentPane().add(b3);

		f.setVisible(true);

	}
}
