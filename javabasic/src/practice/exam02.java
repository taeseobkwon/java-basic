package practice;

import javax.swing.JOptionPane;

public class exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tall = JOptionPane.showInputDialog("당신의 키는?");

		Double tall1 = Double.parseDouble(tall);

		JOptionPane.showMessageDialog(null, "적정몸무게는 " + (tall1 - 100) * 0.9);
	}

}
