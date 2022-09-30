package 배열기본;

public class 배열맛보기 {

	public static void main(String[] args) {
		// 무더기에 저장될 데이터를 미리 알고 있는 경우
		int[] 정답 = { 1, 1, 2, 3 };
		// int[] : int 데이터가 무더기로 저장된 위치(주소)
		// 정답 : 주소가 저장됨
		// {1, 1, 2, 3} : 무더기 영역에 저장된 정수 데이터들
		System.out.println(정답);

		int[] 내답 = { 1, 2, 4, 3 };

		// 무더기에 저장될 데이터를 처음에 모르고 있다가
		// 나중에 넣을 수 있음
		int[] 공간들 = new int[1000]; // 공간 1000개를 일단 만듦
		System.out.println(공간들);

		double[] 키 = { 123.4, 234.2, 124.5 };
		System.out.println(키);

		double[] 공간s = new double[500];
		System.out.println(공간s);

		char[] 성별 = { '남', '여', '남' };
		System.out.println(성별);

		String[] 공간ss = new String[333];
		System.out.println(공간ss);
	}

}
