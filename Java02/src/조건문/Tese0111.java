package 조건문;

import javax.swing.JOptionPane;

public class Tese0111 {

	public static void main(String[] args) {
		String lunch = JOptionPane.showInputDialog("당신이 먹고 싶은 점심 메뉴는");
		if (lunch.equals("짜장면")) {
			JOptionPane.showMessageDialog(null, "중국집으로 가요");
			// System.out.println("중국집으로 가요");

		} else if (lunch.equals("라면")) {

			JOptionPane.showMessageDialog(null, "분식집으로 가요");
			// System.out.println("분식집으로 가요");

		} else if (lunch.equals("회")) {

			JOptionPane.showMessageDialog(null, "횟집으로 가요");
			// System.out.println("횟집으로 가요");

		} else {

			JOptionPane.showMessageDialog(null, "그냥 안먹어요");
			// System.out.println("그냥 안먹어요");
		}

	}

}
