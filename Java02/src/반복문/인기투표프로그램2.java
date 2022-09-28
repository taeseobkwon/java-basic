package 반복문;

import java.util.Scanner;

public class 인기투표프로그램2 {

	public static void main(String[] args) {
		int iu = 0;
		int you = 0;
		int bts = 0;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("인기투표  (1)아이유, (2)유재석, (3)방탄 (4)종료");
						
			int vote = sc.nextInt();
			if (vote == 4) {
				System.out.println("투표를 종료합니다.");
				System.out.println("아이유의 득표수는 " + iu + "표");
				System.out.println("유재석의 득표수는 " + you + "표");
				System.out.println("방탄의 득표수는 " + bts + "표");
				break;
			}
			else if (vote == 1) {
				iu++;
			} else if (vote == 2) {
				you++;
			} else if (vote == 3) {
				bts++;
			} else {
				System.out.println("없는 번호 입니다.");
			}
//			System.out.println("더 하시겠습니까? 종료(x) 계속(o)");
//			String exit = sc.next();
//			char exit2 = exit.charAt(0);
//			if (exit2 == 'x') {
//				System.out.println("투표를 종료합니다.");
//				System.out.println("아이유의 득표수는 " + iu + "표");
//				System.out.println("유재석의 득표수는 " + you + "표");
//				System.out.println("방탄의 득표수는 " + bts + "표");
//				System.exit(0);
			}
		}

	}
//302page문제입니다.