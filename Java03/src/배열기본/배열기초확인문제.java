package 배열기본;

public class 배열기초확인문제 {

	public static void main(String[] args) {
		int[] arr = new int [5];
		System.out.println(arr.length);
		arr[0] = 100 ;
		System.out.println(arr[0]);
		arr[arr.length - 1] = 500 ;
		System.out.println(arr[arr.length - 1]);
		arr[2] = 200 ;
		System.out.println(arr[2]);
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
//배열확인기초문제(JAVA38 page)