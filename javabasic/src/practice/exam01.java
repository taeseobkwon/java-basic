package practice;

import javax.swing.JOptionPane;

public class exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String width = JOptionPane.showInputDialog("가로의 길이는");
		String height = JOptionPane.showInputDialog("세로의 길이는");

		int width1 = Integer.parseInt(width);
		int height1 = Integer.parseInt(height);

		JOptionPane.showMessageDialog(null, "사각형의 너비는 " + width1 * height1 + "입니다.");
	}

}
