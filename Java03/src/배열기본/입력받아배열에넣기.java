package 배열기본;

import java.util.Scanner;

public class 입력받아배열에넣기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[5]; // {0, 0, 0, 0, 0}
		// 키보드로 입력하는 부품을 ram에 가져다 놓음
		
		for (int i = 0; i < 5; i++) {
			
		System.out.println("숫자입력>> ");
		num[i] = sc.nextInt(); //외부입력은 모두 String이지만 nextInt() String을 Int로 변환
		
	}
		int sum = 0;
		for (int x : num) {
			// System.out.println(x);
			sum = sum + x;
		}
		System.out.println(sum);
		System.out.println(sum / 5.0);
		// System.out.println("저장된 데이터는 " + data);
	}

}
