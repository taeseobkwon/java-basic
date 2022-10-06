package 클래스사용하기;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class 일기쓰기 {

	private static JTextField t1;
	private static JTextField t2;
	private static JTextArea t3;
	// public static void main(String[] args) {
	 public void open() {
		// TODO Auto-generated method stub
		// 메인이 아니면 윈도우 빌더 안뜸
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 255, 0));
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("오늘의 날짜");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel.setBounds(72, 66, 134, 56);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 제목");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_1.setBounds(72, 132, 134, 56);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("오늘의 내용");
		lblNewLabel_2.setFont(new Font("굴림", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(72, 201, 134, 56);
		f.getContentPane().add(lblNewLabel_2);
		
		JButton btnNewButton = new JButton("파일에 일기 저장");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = t1.getText();
				String s2 = t2.getText();
				String s3 = t3.getText();
//				String s1 = JOptionPane.showInputDialog("날짜입력");
//				String s2 = JOptionPane.showInputDialog("제목입력");
//				String s3 = JOptionPane.showInputDialog("내용입력");
				
				// 자바프로그램 밖에 있는 자원들(네트워크, db프로그램, 파일, etc)을 연결할 때는
				// 프로그램이 실행되지 못하는 위험한 상황으로 인식해서
				// 반드시 위험한 상황이 발생하면 어떻게 처리할 지 명시해주어야 한다.
				// try ~ catch
				
				try {
					// file.txt와 자바프로그램 간 스트림(강물, 연결통로)를 만들어라
					FileWriter file = new FileWriter(s1 + ".txt");
					// 파일이름이 같으면 덮어쓴다.
					
					// 스트림을 통해서 데이터를 보내라
					file.write(s1 + "\n"); // \n이면 엔터를 넣어준다.
					file.write(s2 + "\n");
					file.write(s3 + "\n");
					
					// 스트림이 닫힐 때 데이터를 다 보냈다고 인식
					file.close();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					System.out.println("파일 저장 중 에러 발생");
				}
			}
		});
		btnNewButton.setBackground(new Color(255, 0, 255));
		btnNewButton.setBounds(43, 379, 331, 46);
		f.getContentPane().add(btnNewButton);
		
		t3 = new JTextArea();
		t3.setFont(new Font("Monospaced", Font.PLAIN, 18));
		t3.setBounds(180, 218, 165, 141);
		f.getContentPane().add(t3);
		
		t1 = new JTextField();
		t1.setBounds(180, 83, 165, 24);
		f.getContentPane().add(t1);
		
		t2 = new JTextField();
		t2.setBounds(180, 149, 165, 24);
		f.getContentPane().add(t2);
		f.setVisible(true);
	}
}
