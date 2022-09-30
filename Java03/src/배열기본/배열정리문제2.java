package 배열기본;

import java.util.Scanner;

public class 배열정리문제2 {

	public static void main(String[] args) {
		String[] box = new String[3];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < box.length; i++) {
			box[i] = sc.next();
		}
	System.out.println(box[0] + "보다는" + box[1]);	
	}

}
//Java59page입니다.