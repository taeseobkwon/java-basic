package 상속;

public class 상속사용 {

	public static void main(String[] args) {
		사람 p = new 사람();
		p.gender = "사람";
		p.name = "클라크";
		System.out.println(p);
		
		맨 m = new 맨();
		m.gender = "남자";
		m.name = "데이비드";
		m.size = 100;
		System.out.println(m);
		
		수퍼맨 sMan = new 수퍼맨();
		sMan.gender = "남자";
		sMan.name = "윌리엄";
		sMan.size = 200;
		System.out.println(sMan);
		sMan.날아다니다(); //수퍼맨
		sMan.달리다(); //맨
		sMan.먹다(); //사람
		sMan.잠자다(); //사람
		
		우먼 w = new 우먼();
		w.gender = "여자";
		w.name = "케이시";
		w.size = 100;
		System.out.println(w);
		
		원더우먼 sW = new 원더우먼();
		sW.gender = "여자";
		sW.name = "레인";
		sW.size = 200;
		System.out.println(sW);
		sW.싸우다();
		sW.뛰다();
		sW.먹다();
		sW.잠자다();
		
		직원 work = new 직원();
		work.address = "경기 성남시 분당구 정자일로 95";
		work.name = "김네이버";
		work.rrn = 990101;
		work.salary = 5000;
		System.out.println(work);
		
		매니저 manager = new 매니저();
		manager.address = "제주특별자치도 제주시 첨단로 242";
		manager.bonus = 3000;
		manager.name = "최카카오";
		manager.rrn = 990411;
		manager.salary = 9000;
		manager.test();
		System.out.println(manager);
		
	}

}
