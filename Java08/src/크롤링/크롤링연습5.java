package 크롤링;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 크롤링연습5 {

	public static void main(String[] args) {
		String[] code = {"005930", "035720", "035420"};
		String[] company = {"삼성전자", "카카오", "NAVER"};
		
		for (int i = 0; i < company.length; i++) {
			try {
//				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930\r\n" + "").get();
				Document doc = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code[i]).get();
				System.out.println("--------------");
				System.out.println("회사명 : " + company[i]);

				// 전일가
				// System.out.println("전일가");
				Elements list = doc.select("td.first").select(".blind");
				// <td class = "first>
				// System.out.println(list);
				Element tag = list.get(0); //전일가
				System.out.println("전일가 : " + tag.text());
				String yesterday = tag.text();

				// 현재가
				// System.out.println("현재가");
				Elements list2 = doc.select("div.today").select(".blind");
				// System.out.println(list2);
				Element tag2 = list2.get(0);
				System.out.println("현재가 : " + tag2.text());
				String today = tag2.text();

				// 시가
				// System.out.println("시가");
				Elements list3 = doc.select("td.first").select(".blind");
				Element tag3 = list3.get(1);
				System.out.println("전일가 : " + tag3.text());
				String aver = tag3.text();

			} catch (IOException e) {
				e.printStackTrace();
			} 
		}

	}

}
