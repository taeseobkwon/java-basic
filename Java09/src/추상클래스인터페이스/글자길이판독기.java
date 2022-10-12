package 추상클래스인터페이스;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 글자길이판독기 {

	public static void main(String[] args) {
		JFrame f = new JFrame("글자/단어 길이 판독기");
		f.setSize(600, 600);
		f.getContentPane().setLayout(null);
		
		JLabel l1 = new JLabel("Characters :");
		l1.setBounds(104, 80, 130, 37);
		f.getContentPane().add(l1);
		
		JLabel l2 = new JLabel("Words :");
		l2.setBounds(104, 127, 130, 37);
		f.getContentPane().add(l2);
		
		JTextArea t1 = new JTextArea();
		t1.setForeground(new Color(0, 0, 0));
		t1.setBackground(new Color(255, 255, 255));
		t1.setBounds(104, 180, 319, 314);
		f.getContentPane().add(t1);
		// String result = t1.getText(t1);
		
		JButton b1 = new JButton("Click");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				l1.setText("Characters : ss");
				l2.setText("Words : " );
			}
		});
		b1.setBounds(104, 504, 97, 47);
		f.getContentPane().add(b1);
		
		JButton b2 = new JButton("Pad color");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				t1.setBackground(new Color(128, 128, 128));
			}
		});
		b2.setBounds(213, 504, 97, 47);
		f.getContentPane().add(b2);
		
		JButton b3 = new JButton("Text color");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				t1.setForeground(new Color(255, 0, 0));
			}
		});
		b3.setBounds(324, 504, 97, 47);
		f.getContentPane().add(b3);
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
