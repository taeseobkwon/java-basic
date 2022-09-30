package 배열기본;

public class 배열기본확인문제 {

	public static void main(String[] args) {
		String[] tour = {"일본", "호주", "독일", "미국", "대만"};
		for (String  s : tour) {
			System.out.print(s + " ");
		}
		System.out.println();
		//for each 자동으로 인덱스를 하나씩 옮겨가면서 반복적으로 꺼내와서 임시변수에 넣어준다
		
		for (int i = 0; i < tour.length; i++) {
			System.out.print(tour[i]);
		}
		System.out.println();
		// for
		char[] color = {'r', 'g', 'p', 'y', 'b'};
		for (char c : color) {
			System.out.print(c + " ");
		}
		System.out.println();
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i]);
		}
		double[] height = {180.5, 146.5, 186.6, 189.1, 156.6};
		for (double d : height) {
			System.out.println(d + " ");
		}
		System.out.println();
		for (int i = 0; i < height.length; i++) {
			System.out.println(height[i]);
		}
		}
		 
		
//		color[0] = c
		
		
	}


