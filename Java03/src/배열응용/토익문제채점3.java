package 배열응용;

import java.util.Random;

public class 토익문제채점3 {

	public static void main(String[] args) {
		// 1. 답안지, 내답안 공간 만들어라
		// 2. 랜덤하게 만들어주는 부품 만들어라
		// 3. 990번 반복해서 답안지, 내답안에 숫자를 넣어라 (1~4범위)
		// 4. 같은 인덱스끼리 990번 반복해서 비교 -> 동일하면 점수+1
		// 5. 점수프린트

		int[] 답안지 = new int[990];
		int[] 내답안 = new int[990];
		
		Random r = new Random();
		int jumsu = 0;
		for (int i = 0; i < 내답안.length; i++) {
			답안지[i] = r.nextInt(4) + 1;
			내답안[i] = r.nextInt(4) + 1;
			if (답안지[i] == 내답안[i]) {
				jumsu++;
			}
			
		}
		System.out.println(jumsu + "문제를 맞추셨습니다.");
	}

}
