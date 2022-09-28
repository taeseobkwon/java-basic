package practice;

public class Test012 {

	public static void main(String[] args) {
		int p = 66;
		int m = 77;
		int e = 88;
		int k = 99;
		
		int sum = (p + m + e + k);
		// 정수와 정수의 계산 결과는 실수가 나오더라도 실수를 자르고 정수로 처리됨
		// 둘 중 하나를 실수로 만들어라 ==> 둘 중 하나라 실수면 결과는 무조건 실수
		double av = sum / 4.0;
		
		System.out.println("과목의 합은" + sum);
		System.out.println("과목의 평균은" + av);
		
		double PI = 3.14;
		double half = 2.2;
		double dool = PI * half * half;
		
		System.out.printf("%.2f", dool);
//		System.out.println("원의 면적은" + dool);
		
	}

}
