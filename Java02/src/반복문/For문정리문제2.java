package 반복문;

public class For문정리문제2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i < 1000; i = i + 3) {
			if (sum >= 100) {
				break;
				// break를 포함하고 있는 블럭 중료
			}
			if (i % 5 == 0) {
				// 5의 배수는 skip
				continue;
			}
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
