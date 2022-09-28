package 조건문;

import javax.swing.JOptionPane;

public class Test01 {

	public static void main(String[] args) {
		String pw = JOptionPane.showInputDialog("암호를 대시오");

		switch (pw) {
		case "pass":
			System.out.println("들어오세요.");
			break;

		default:
			System.out.println("나가세요.");
			break;
		}

	}

}
