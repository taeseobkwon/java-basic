package practice;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		// 설정한 암호는 p였음
		// 입력한 암호는 q였음
		char pw = 'p';
		
		char pw2 = 'q';
				
		if (pw == pw2) {
				System.out.println("PASS!");
		} else {System.out.println("재입력!");
		
		}
		
		double change = 2.2;
				if (change > 2) {
					System.out.println("다이어트 성공");
				}
				
		if (pw == pw2 && change > 2) {
			System.out.println("오늘은 성공");
			
		} else {System.out.println("내일 다시 도전");

		}
	}

}
