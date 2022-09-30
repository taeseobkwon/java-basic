package 배열응용;

public class 스트링연습2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s2 = "감자,고구마,양파";
		String[] s3 = s2.split(","); //{"감자","고구마","양파"}
		// ,을 기준으로 Stinrg배열 만듦
		System.out.println(s3[0]);
	}

}
