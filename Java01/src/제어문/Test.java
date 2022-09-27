package 제어문;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;

public class Test {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(400, 400);
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setFont(new Font("궁서", Font.PLAIN, 50));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(128, 0, 0));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(new Color(128, 64, 0));
		btnNewButton_1.setFont(new Font("돋움", Font.PLAIN, 21));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("가운데");
		btnNewButton_2.setBackground(new Color(0, 255, 255));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("우쪽");
		btnNewButton_3.setFont(new Font("a연애소설", Font.PLAIN, 32));
		btnNewButton_3.setForeground(new Color(0, 0, 128));
		btnNewButton_3.setBackground(new Color(255, 255, 255));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.setForeground(new Color(255, 255, 255));
		btnNewButton_4.setBackground(new Color(0, 120, 215));
		btnNewButton_4.setFont(new Font("배달의민족 주아", Font.BOLD, 54));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);
	}

}
	