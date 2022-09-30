package 배열응용;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;

public class 영화앨범 {

	static int start = 2;
	public static void main(String[] args) {
		
		String[] title = {"인생은 뷰티풀: 비타돌체", "탑건: 매머릭", "아바타 리마스터링", "시맨틱 에러: 더 무비", "극장판 짱구는 못말려: 수수께끼! 꽃피는 천하 떡잎 학교"};
		String[] img = {"뷰티풀.jpg", "탑건.jpg", "아바타.jpg", "에러.jpg", "짱구.jpg"};
		double[] score = {9.82, 9.60, 9.57, 9.50, 9.44};
		
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(900, 900);
		
		JLabel top = new JLabel("아바타 리마스터링");
		top.setBackground(new Color(0, 255, 0));
		top.setFont(new Font("굴림", Font.BOLD, 50));
		top.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(top, BorderLayout.NORTH);
		
		JLabel center = new JLabel("그림넣어야함");
		ImageIcon icon = new ImageIcon(img[2]);
		center.setIcon(icon);
		f.getContentPane().add(center, BorderLayout.CENTER);
		
		JLabel bot = new JLabel("9.57점");
		bot.setBackground(new Color(0, 255, 0));
		bot.setFont(new Font("굴림", Font.BOLD, 50));
		bot.setHorizontalAlignment(SwingConstants.CENTER);
		f.getContentPane().add(bot, BorderLayout.SOUTH);
		
		JButton left = new JButton("<<");
		left.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			start = start - 1;
			if (start < 0) {
				left.enable(true);
				JOptionPane.showMessageDialog(f, "첫페이지입니다.");
			}
			top.setText(title[start]);
			bot.setText(score[start] + "점");
			ImageIcon icon = new ImageIcon(img[start]);
			center.setIcon(icon);
			}
		});
		f.getContentPane().add(left, BorderLayout.WEST);
		
		JButton right = new JButton(">>");
		right.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			start++;
			if (start > 6) {
				right.setEnabled(true);
				JOptionPane.showMessageDialog(f, "마지막페이지입니다.");
			}
			top.setText(title[start]);
			bot.setText(score[start]+"점");
			ImageIcon icon = new ImageIcon(img[start]);
			center.setIcon(icon);
			}
		});
		left.setBackground(Color.GREEN);
		left.setFont(new Font("굴림", Font.BOLD, 50));
		right.setBackground(Color.GREEN);
		right.setFont(new Font("굴림", Font.BOLD, 50));
		f.getContentPane().add(right, BorderLayout.EAST);
		f.setVisible(true);
		
	}
}
