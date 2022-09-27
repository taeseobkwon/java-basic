package practice;

import javax.swing.JOptionPane;

public class Test011 {

	public static void main(String[] args) {
		char pw = 'p';
		String pw3 = JOptionPane.showInputDialog("암호를 입력해주세요.");
		char pw2 = pw3.charAt(0);

		if (pw == pw2) {
			System.out.println("PASS");

		} else {
			System.out.println("재입력");

		}
		double yesterday = 80.4;
		String today = JOptionPane.showInputDialog("오늘의 몸무게는");
		double today2 = Double.parseDouble(today);
		if ((yesterday - today2) > 2) {
			System.out.println("다이어트 성공!");
		} else {
			System.out.println("다이어트 실패!");

		}

		if (pw == pw2 && (yesterday - today2) > 2) {
			System.out.println("오늘은 성공");
		} else {
			System.out.println("내일 다시 도전");

		}

	}

}
