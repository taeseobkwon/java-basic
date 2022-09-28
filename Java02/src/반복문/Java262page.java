package 반복문;

import java.util.Scanner;

public class Java262page {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int count1 = 0;

		while (true) {
			System.out.print("숫자입력1 >> ");
			int no1 = sc.nextInt();
			System.out.print("숫자입력2 >> ");
			int no2 = sc.nextInt();
			if (no1 > no2) {
				System.out.println("앞 숫자가 더 큽니다.");
				count++;
			} else if (no1 < no2) {
				System.out.println("뒷 숫자가 더 큽니다.");

				count1++;
			} else {
				System.out.println("두 숫자가 같습니다.");
			}
			System.out.println("종료하시겠습니까? 종료(x) 계속(o)");
			String exit = sc.next();
			char exit2 = exit.charAt(0); // 첫번째 문자 1개를 가지고 와라
			if (exit2 == 'x') {
				System.out.println("앞 숫자가 더 큰 횟수는 " + count);
				System.out.println("뒷 숫자가 더 큰 횟수는 " + count1);
				System.out.println("게임을 종료합니다.");
				System.exit(0);
			}
		}

	}

}
