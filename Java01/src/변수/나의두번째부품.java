package 변수;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
// 부품의 위치를 알려주는 부분

public class 나의두번째부품 {

	public static void main(String[] args) {
		// 자주 쓰이는 부품을 대문자로 바로 쓸 수 있도록 준비되어 있음
		// System, JOptionPane, 숫자로 변환해주는 부품들(Integer)

		// 자주 안쓰는 기능을 가진 부품은 new를 가지고 새로 만들어 쓴다
		// JFrame, Date, ...
		// new JFrame();
		
		// 취미, 이름 ==> 출력
		String hobby = JOptionPane.showInputDialog("당신의 취미는 무엇인가요");
		String name = JOptionPane.showInputDialog("당신의 이름은 무엇인가요");
		
		// prompt(), 입력용
		String age = JOptionPane.showInputDialog("당신의 나이를 입력하세요.");
		
		//alert()
		JOptionPane.showMessageDialog(null, "나의 나이는 " + age);
		JOptionPane.showMessageDialog(null, "나의 취미는 " + hobby);
		JOptionPane.showMessageDialog(null, "나의 이름은 " + name);
		
	}

}
