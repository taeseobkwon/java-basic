package 조건문;

import java.util.Date;

public class Test012 {

	public static void main(String[] args) {
		Date date = new Date();
		int hour = date.getHours();
		int month = date.getMonth() + 1;
		
				if (hour < 11) {
			System.out.println("굿모닝");
		} else if (hour < 15) {
			System.out.println("굿애프터눈");
		} else if (hour < 19) {
			System.out.println("굿이브닝");
		} else {
			System.out.println("굿나잇");
		}
			
		
	}

}
