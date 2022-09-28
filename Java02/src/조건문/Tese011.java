package 조건문;

import javax.swing.JOptionPane;

public class Tese011 {

	public static void main(String[] args) {
		String lunch = JOptionPane.showInputDialog("당신이 먹고 싶은 점심 메뉴는");
		if (lunch.equals("짜장면")) {
			System.out.println("중국집으로 가요");

		} else if (lunch.equals("라면")) {
			System.out.println("분식집으로 가요");

		} else if (lunch.equals("회")) {
			System.out.println("횟집으로 가요");

		} else {
			System.out.println("그냥 안먹어요");
		}

	}

}
