package 배열응용;

import java.util.Scanner;

public class 입력받아배열에넣기확인문제self {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] before = new String[3];
		String[] after = new String[3];
		
		System.out.println("작년에 가고 싶었던 곳 3군데를 순서대로 쓰세요");
		for (int i = 0; i < 3; i++) {
			before[i] = sc.next();
		}
		System.out.println();
		System.out.println("올해 가고 싶은 곳 3군데를 순서대로 쓰세요");
		for (int i = 0; i < 3; i++) {
			after[i] = sc.next();
		}
		int same = 0;
		for (int i = 0; i < 3; i++) {
			if (after[i].equals(before[i])) {
				same++;
			}
			
		}
		
		System.out.println("작년과 올해 순위가 동일한 여행지는 " + same + "곳 입니다.");
	}

}
//입력받아배열에넣기확인문제입니다.