package 배열응용;

public class 배열여러개응용 {

	public static void main(String[] args) {
		// 배열 여러개를 응용해서
		// 다양한 타입의 데이터를 넣어보자
		String[] 식구 = {"아버지", "어머니", "나"};
		int[] 나이 = {100, 50, 20};
		double[] 키 = {177.7, 132.2, 155.3};
		
		// 나에 대한 정보 입력
		// index 2번에 나에 대한 정보가 들어있음
		System.out.println(식구[2] + " " + 나이[2] + " " + 키[2]);
		
		// 우리식구 모두 프린트
		System.out.println(식구[0] + "의 나이는 " + 나이[0] + "세시고 키는" + 키[0] + "cm이십니다.");
		System.out.println(식구[1] + "의 나이는 " + 나이[1] + "세시고 키는" + 키[1] + "cm이십니다.");
		System.out.println(식구[2] + "의 나이는 " + 나이[2] + "살이고 키는" + 키[2] + "cm입니다.");
		
		
		
	}

}
