package 추상클래스인터페이스;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class SwingEX6 extends JFrame{
	int count = 0;
	Font f1;
	
	SwingEX6(){
		
		f1 = new Font("바탕",Font.BOLD,17);
		
		//JLabel
		JLabel lb1 = new JLabel("단어 :");
		lb1.setBounds(50,35,100,30);
		lb1.setFont(f1);
		
		//JLabel
		JLabel lb2 = new JLabel("문자 :");
		lb2.setBounds(150,35,100,30);
		lb2.setFont(f1);
		
		// JTextArea
		JTextArea jt1 = new JTextArea();
		jt1.setBounds(50, 75, 200, 200);
		jt1.setFont(f1);
		
		// JButton
		JButton bt1 = new JButton("Count");
		bt1.setBounds(50, 300, 100, 30);
		bt1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = jt1.getText();
				String words[] =text.split("\\s");
				lb1.setText("단어 :" + words.length);
				lb2.setText("문자 :" + text.length());
			}
		});
		
		add(jt1);add(lb1);add(lb2);add(bt1);
		setTitle("JButton EX");
		setSize(320,400);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SwingEX6();
	}
}
