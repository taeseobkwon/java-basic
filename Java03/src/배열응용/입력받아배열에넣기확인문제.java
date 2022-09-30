package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제 {

	public static void main(String[] args) {
		String[] before = new String[3]; //작년
		String[] after = new String[3]; //올해
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < after.length; i++) {
			System.out.println("작년 여행지 입력>> ");
			before[i] = sc.next();
		}
		
		System.out.println();
		for (int i = 0; i < after.length; i++) {
			System.out.println("올해 여행지 입력>>");
			after[i] = sc.next();
			
					
		}
		int count = 0; //3번 반복
		for (int i = 0; i < after.length; i++) {
			if (before[i].equals(after[i])) {
				count++;
			}
		}
	}
	

}
