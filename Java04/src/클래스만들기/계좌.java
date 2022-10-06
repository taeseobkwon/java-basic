package 클래스만들기;

import java.util.Scanner;

public class 계좌 {
	public String 이름;
	public String 계좌이름;
	public int 금액;
	
	public void 입금하다() {
	System.out.println(이름 + "님이 " + 금액 + "원을 " + "입금하셨습니다.");	
		}
	public void 출금하다() {
		System.out.println(이름 + "님이 " +  계좌이름 + "에서 출금하셨습니다.");	
		
	}
	public void 잔액확인() {
		System.out.println("이름=" + 이름 + ", 계좌이름=" + 계좌이름 + ", 금액=" + 금액);	
	}
}
