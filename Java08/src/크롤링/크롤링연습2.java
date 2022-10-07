package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습2 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930").get();
			// Elements list = doc.select(".code"); //class가 nav인 태그를 다 찾아서 묶어서 와줘!
			// System.out.println(list.get(i));
			// Element tag = list.get(0); //Element는 태그를 나타냄
			// System.out.println(tag.text()); // <a>메일</a>중에서 메일만 추출
			
			Elements list = doc.select(".blind");
			System.out.println(list.size());
			// System.out.println(list);
//			for (int i = 0; i < list.size(); i++) {
//				Element tag = list.get(i);
//				System.out.println(i + " : " + tag.text());
//			}
			
			// 현재가
			Element tag = list.get(16);
			System.out.println("현재" + tag.text());
			
			// 전일가
			Element tag2 = list.get(19);
			System.out.println("어제" + tag2.text());
						
			// 고가
			Element tag3 = list.get(20);
			System.out.println("최고" + tag3.text());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
