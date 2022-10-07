package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습3 {

	public static void main(String[] args) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자.
		try {
			Document doc = Jsoup.connect("https://sports.news.naver.com/kbaseball/record/index?category=kbo").get();
			// System.out.println(doc);
			Elements list = doc.select(".tm"); //class가 nav인 태그를 다 찾아서 묶어서 와줘!
			// Elements는 ArrayList의 자식
			System.out.println("현재 kbo 리그 참가 팀은 " + list.size() + "개 팀입니다.");
			for (int i = 0; i < list.size(); i++) {
				// System.out.println(list.get(i));
				Element tag = list.get(i); //Element는 태그를 나타냄
				System.out.println((i+1) + "등 : " + tag.text()); // <a>메일</a>중에서 메일만 추출
				
				
				
			}
//			System.out.println(list.get(0));
//			System.out.println(list.get(1));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
