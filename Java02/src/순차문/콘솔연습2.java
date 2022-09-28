package 순차문;

import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class 콘솔연습2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 입력 : 나이
		System.out.print("나이입력 : ");
		int age = sc.nextInt(); //String으로 입력받아서 정수로 변환
		// 처리
		int age2 = age + 1;
		// 출력
		System.out.println("내년 나이는 " + age2);
		
	}

}
