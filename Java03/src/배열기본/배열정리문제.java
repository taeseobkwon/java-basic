package 배열기본;

import java.util.Scanner;

public class 배열정리문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[5];
		System.out.println("숫자입력 >>");
		
		for (int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
			
		}
		
		System.out.println(num[0] + num[2]);
		
	}

}
