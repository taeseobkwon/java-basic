package 크롤링;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 주식 {
	private static JTextField t1;
	// 버튼을 누를 때 마다 textarea부분에 결과를 넣어주려면
	// 아무곳에서나 접근이 가능해야함
	// 전역변수로 선언해야함
	static JTextArea t2;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("나의 주식 크롤링");
		f.getContentPane().setBackground(new Color(0, 128, 192));
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("CODE : ");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(141, 271, 201, 52);
		f.getContentPane().add(lblNewLabel);

		t1 = new JTextField();
		t1.setHorizontalAlignment(SwingConstants.CENTER);
		t1.setFont(new Font("굴림", Font.BOLD, 20));
		t1.setBackground(new Color(0, 255, 0));
		t1.setBounds(141, 333, 201, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextArea();
		t2.setBounds(141, 426, 201, 204);
		f.getContentPane().add(t2);

		JButton b1 = new JButton("삼성전자");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// code를 주면서, 크롤링 해달라고 하자
				// 크롤링연습6.java의 naver(code)
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("005930");
				t2.setText(result);
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 20));
		b1.setBackground(new Color(255, 128, 0));
		b1.setBounds(141, 27, 201, 60);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("카카오");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035720");
				t2.setText(result);
			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 20));
		b2.setBackground(new Color(255, 128, 0));
		b2.setBounds(141, 97, 201, 60);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("NAVER");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver("035420");
				t2.setText(result);
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 20));
		b3.setBackground(new Color(255, 128, 0));
		b3.setBounds(141, 167, 201, 60);
		f.getContentPane().add(b3);

		JButton b4 = new JButton("크롤링 시작");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// t1에 입력한 code를 가져와라
				String code = t1.getText();
				크롤링연습6 크롤링 = new 크롤링연습6();
				String result = 크롤링.naver(code);
				t2.setText(result);

			}
		});
		b4.setFont(new Font("굴림", Font.BOLD, 18));
		b4.setBackground(new Color(255, 255, 0));
		b4.setBounds(151, 380, 175, 37);
		f.getContentPane().add(b4);
		f.setSize(500, 700);

		f.setVisible(true);

	}
}
