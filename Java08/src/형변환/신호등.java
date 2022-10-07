package 형변환;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JScrollBar;

public class 신호등 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 0, 0));
		f.setSize(400, 800);

		JButton b1 = new JButton("빨간 신호");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("red.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		b1.setBackground(new Color(255, 0, 0));
		f.getContentPane().add(b1);

		JButton b2 = new JButton("노란 신호");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("yel.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		b2.setBackground(new Color(255, 255, 0));
		f.getContentPane().add(b2);

		JButton b3 = new JButton("초록 신호");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JLabel img = new JLabel();
				ImageIcon icon = new ImageIcon("gre.png");
				img.setIcon(icon);
				f.getContentPane().add(img);
				f.setVisible(true);
			}
		});
		b3.setBackground(new Color(0, 255, 0));
		f.getContentPane().add(b3);

		f.setVisible(true);
	}
}
