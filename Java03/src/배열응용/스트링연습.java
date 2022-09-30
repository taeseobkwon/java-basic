package 배열응용;

public class 스트링연습 {

	public static void main(String[] args) {
		String sn = "931212-1035715";  //숫자로서 의미 없으면 String
		String s = "나는 프로그래머야";
		String s2 = "진짜!";
		System.out.println(s + s2); //스트링결합
		System.out.println(s.concat(s2)); //스트링결합
		System.out.println(s.charAt(0)); //문자1글자 추출
		System.out.println(s.endsWith("야")); //특정한 문자로 끝나는지 확인
		System.out.println(s.substring(3)); //인덱스 3이후 글자들 모두 추출
		System.out.println(s.substring(3, 8)); //인덱스 3~7까지 추출 (마지막 하나 앞까지)
		System.out.println(s.contains(s2)); //s에 s2가 포함되어 있는지?
		System.out.println(s.lastIndexOf("프")); //s중 "프" 글자 위치 (여러개면 마지막 글자)
		System.out.println(s.toUpperCase()); //대문자로
		System.out.println(s.toLowerCase()); //소문자로
		System.out.println(s.length()); //글자수
		System.out.println(s.replace("나", "너")); //글자대체
			
		
		String no1 = "    011-245-1234    ";
		
		//앞뒤 공백 제거
		String no = no1.trim();
		String first = no.substring(0, 3); //011
		String second = no.substring(4, 7); //245
		String third = no.substring(8, 11); //1234
		
		// 문자열 분리
		String[] no2 = no.split("-");
		System.out.println(no2[0]);
		System.out.println(no2[1]);
		System.out.println(no2[2]);
		
		
		// 문자열 비교
		switch (first) {
		case "011":
			System.out.println("SK");
		case "019":
			System.out.println("LG");
			break;

		default:
			System.out.println("APPLE");
			break;
		}
		// 문자열 길이
		if (second.length() >= 4) {
			System.out.println("최신폰");
		} else {System.out.println("올드폰");

		}
		// 문자열 길이
		if (s.length() >= 10) {
			System.out.println("유효한 전화번호");
		} else {
			System.out.println("유효하지 않은 전화번호");
		}
		
		String s3 = "감자,고구마,양파";
		String[] s4 = s3.split(","); //{"감자","고구마","양파"}
		// ,을 기준으로 Stinrg배열 만듦
		System.out.println(s4[0]);
		
		
		
		
		
		
	}

}
//String연습입니다.
