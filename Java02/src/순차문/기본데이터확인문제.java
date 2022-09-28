package 순차문;

import java.util.Scanner;

public class 기본데이터확인문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("나의 이름은 : ");
		String name = sc.next();

		System.out.print("나의 키는 : ");
		Double tall = sc.nextDouble();

		System.out.print("나의 몸무게는 : ");
		Double weight = sc.nextDouble();

		System.out.print("나는 저녁을 먹었나요 : ");
		boolean dinner = sc.nextBoolean();
		sc.nextLine();
		
		System.out.print("나의 좌우명은 : ");
		String goal = sc.nextLine();

		System.out.println("============");
		System.out.println("내 이름은 " + name + "입니다.");
		System.out.println("내 내년키 " + (tall + 10) + "입니다.");
		System.out.println("내 내년몸무게는 " + (weight - 10) + "입니다.");
		System.out.println("내 저녁은 " + dinner + "입니다.");
		System.out.println("내 좌우명은 " + goal + "입니다.");

	}

}
