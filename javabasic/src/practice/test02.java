package practice;

import javax.swing.JOptionPane;

public class test02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ph = JOptionPane.showInputDialog("체육 점수를 입력하세요.");
		String ma = JOptionPane.showInputDialog("수학 점수를 입력하세요.");
		String en = JOptionPane.showInputDialog("영어 점수를 입력하세요.");
		String kr = JOptionPane.showInputDialog("국어 점수를 입력하세요.");
		
		int ph1 = Integer.parseInt(ph);
		int ma1 = Integer.parseInt(ma);
		int en1 = Integer.parseInt(en);
		int kr1 = Integer.parseInt(kr);
		
		
		
//		String result = (ph1 + ma1 + en1 + kr1);
		System.out.println("네 과목 점수의 합은" + (ph1 + ma1 + en1 + kr1));
		System.out.println("네 과목 점수의 평균은" + (ph1 + ma1 + en1 +kr1) / 4);
			
		double pi = 3.14;
		double half = 2.2;
		System.out.println("원의 면적은" + pi * half * half);
	}

}
