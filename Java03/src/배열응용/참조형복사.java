package 배열응용;

public class 참조형복사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 참조형복사(주소만 복사, 값은 복사x, 얕은 복사)
		int[] n1 = { 100, 200, 300 };
		int[] n2 = n1;
		System.out.println("n1 : " + n1);
		System.out.println("n2 : " + n2);
		
		System.out.println("-----------------");
		int[] n3 = n1.clone();
		System.out.println("n1 : " + n1);
		System.out.println("n3 : " + n3);
		System.out.println();
		System.out.println("값 변경하기 전");
		for (int x : n1) {
			System.out.println(x + " ");
		}
		System.out.println();
		for (int x : n3) {
			System.out.println(x + " ");
		}
		System.out.println("\n값 변경한 후");
		n3[0] = 999;
		
		for (int x : n1) {
			System.out.println(x + " ");
		}
		System.out.println();
		for (int x : n3) {
			System.out.println(x + " ");
		}
	}

}
