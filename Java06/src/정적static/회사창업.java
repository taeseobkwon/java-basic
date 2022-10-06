package 정적static;

public class 회사창업 {

	public static void main(String[] args) {
		직원 work1 = new 직원("홍길동", 25, "여");
		System.out.println(직원.count + "번째 직원");
		System.out.println(work1);
		
		직원 work2 = new 직원("김길동", 25, "남");
		System.out.println(직원.count + "번째 직원");
		System.out.println(work2);
		
		직원 work3 = new 직원("송길동", 25, "여");
		System.out.println(직원.count + "번째 직원");
		System.out.println(work3);
		System.out.println("직원들의 평균 나이는 " + 직원.avgage() + "살 입니다.");
		
	}

}
