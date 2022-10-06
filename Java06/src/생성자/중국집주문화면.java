package 생성자;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class 중국집주문화면 {
	static int count; // int count = 0;과 동일, 전역변수는 자동 초기화
	static final int PRICE = 5000; // 상수는 final을 붙여서 변경불가능으로 설정
	
	private static JTextField t1;
	static int 짬뽕count = 0;
	static int 우동count = 0;
	static int 짜장count = 0;
	private static JTextField t2;
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(128, 255, 128));
		f.setSize(800, 500);
		f.getContentPane().setLayout(null);
		
		JLabel t00 = new JLabel("개수");
		t00.setBounds(509, 25, 33, 49);
		f.getContentPane().add(t00);
		
		t1 = new JTextField();
		t1.setBackground(new Color(255, 128, 64));
		t1.setBounds(566, 25, 116, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel center = new JLabel("");
		center.setFont(new Font("굴림", Font.BOLD, 16));
		// center.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java06\\짜장.PNG"));
		ImageIcon img = new ImageIcon("짜장.PNG");
		center.setIcon(img);
		center.setBounds(243, 122, 300, 236);
		f.getContentPane().add(center);
		
		JLabel result = new JLabel("결제금액");
		result.setBounds(173, 368, 118, 49);
		f.getContentPane().add(result);
		
		JButton btnNewButton = new JButton("짬뽕");
		btnNewButton.setBackground(new Color(64, 0, 64));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 주문량을 현재 카운트에 하나 플러스
				count++; // count = count + 1, 증감연산자
				짬뽕count++;
				// t1에 현재 주문량 변경
				t1.setText(count + "개");
				// center 이미지 변경
				// center.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java06\\짬뽕.PNG"));
				ImageIcon img = new ImageIcon("짬뽕.PNG");
				center.setIcon(img);
				// result 결제금액 변경
				result.setText("결제금액 : " + count * PRICE + "원");
				t2.setText("짬뽕은 " + 짬뽕count + " 개, 우동은 " + 우동count + "개, 짜장은 " + 짜장count + "개");
			}
		});
		btnNewButton.setBounds(42, 10, 97, 64);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("우동");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // count = count + 1, 증감연산자
				우동count++;
				t1.setText(count + "개");
				// center.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java06\\우동.PNG"));
				ImageIcon img = new ImageIcon("우동.PNG");
				center.setIcon(img);
				result.setText("결제금액 : " + count * PRICE + "원");
				t2.setText("짬뽕은 " + 짬뽕count + " 개, 우동은 " + 우동count + "개, 짜장은 " + 짜장count + "개");

			}
		});
		btnNewButton_1.setBackground(new Color(255, 128, 64));
		btnNewButton_1.setBounds(151, 10, 97, 64);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("짜장");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++; // count = count + 1, 증감연산자
				짜장count++;
				t1.setText(count + "개");
				// center.setIcon(new ImageIcon("D:\\multi-campus\\javaworkspace\\Java06\\짜장.PNG"));
				ImageIcon img = new ImageIcon("짜장.PNG");
				center.setIcon(img);
				result.setText("결제금액 : " + count * PRICE + "원");
				t2.setText("짬뽕은 " + 짬뽕count + " 개, 우동은 " + 우동count + "개, 짜장은 " + 짜장count + "개");
				
			}
		});
		btnNewButton_2.setBackground(new Color(128, 0, 0));
		btnNewButton_2.setBounds(260, 10, 97, 64);
		f.getContentPane().add(btnNewButton_2);
		
		JLabel t00_1 = new JLabel("총주문");
		t00_1.setBounds(509, 84, 67, 49);
		f.getContentPane().add(t00_1);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBackground(new Color(255, 128, 64));
		t2.setBounds(566, 84, 206, 49);
		f.getContentPane().add(t2);
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
