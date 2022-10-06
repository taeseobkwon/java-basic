package 정적static;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Count {
	static int count;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(300, 300);
		JLabel t1 = new JLabel("0");
		Font font = new Font("궁서", Font.BOLD, 100);
		t1.setFont(font);
		t1.setForeground(Color.RED);

		JButton b1 = new JButton("1더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				t1.setText(count + "");
			}
		});

		JButton b2 = new JButton("0으로 초기화");
		b2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count = 0;
				t1.setText(count + "");
			}
		});
		JButton b3 = new JButton("1빼기");
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				count--;
				t1.setText(count + "");
			}
		});
		b1.setBackground(Color.GREEN);
		b3.setBackground(Color.GREEN);
		b2.setBackground(Color.BLUE);
		b2.setForeground(Color.WHITE);

		FlowLayout flow = new FlowLayout();
		f.getContentPane().setLayout(flow);
		f.getContentPane().add(b1);
		f.getContentPane().add(b2);
		f.getContentPane().add(b3);
		f.getContentPane().add(t1);

		f.setVisible(true);
	}

}
