package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습6 {

	public String naver(String code) {
		// 1. 사이트에 연결해서, html문서를 다 가지고 오자
		// try안에 있으면 tag에 접근 불가라서 tag의 텍스를 이용해서 return불가
		// return할 수 있도록 선언 범위를 밖으로 빼줘야 함
		// 지역변수이기 때문에 우리가 초기화 시켜줘야 함
		Element tag = null, tag2 = null, tag3 = null;
			try {
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code).get();
				// System.out.println("--------------");

				// 전일가
				// System.out.println("전일가");
				Elements list = doc.select("td.first").select(".blind");
				// <td class = "first>
				// System.out.println(list);
				tag = list.get(0); //전일가
				// System.out.println("전일가 : " + tag.text());
				String yesterday = tag.text();

				// 현재가
				// System.out.println("현재가");
				Elements list2 = doc.select("div.today").select(".blind");
				// System.out.println(list2);
				tag2 = list2.get(0);
				// System.out.println("현재가 : " + tag2.text());
				String today = tag2.text();

				// 시가
				// System.out.println("시가");
				Elements list3 = doc.select("td.first").select(".blind");
				tag3 = list3.get(1);
				// System.out.println("시가 : " + tag3.text());
				String aver = tag3.text();

				// 파일로 저장
				// filewriter
				
			} catch (IOException e) {
				e.printStackTrace();
			} 
			return "전일가 : " + tag.text() + "\n" +
					"현재가 : " + tag2.text() + "\n" +
					"시가 : " + tag3.text();
	}

}
