package practice;

import javax.swing.JOptionPane;

public class exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String tel = JOptionPane.showInputDialog("통신사를 입력해주세요");
		String no = JOptionPane.showInputDialog("전화번호를 입력해주세요");
		String name = JOptionPane.showInputDialog("이름을 입력해주세요");

		String result = name + "님은 " + tel + "에 " + no;

		JOptionPane.showMessageDialog(null, result + "로 가입되셨습니다.");
	}

}
