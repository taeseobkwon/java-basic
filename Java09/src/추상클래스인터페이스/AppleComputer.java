package 추상클래스인터페이스;

public class AppleComputer implements Computer {

	@Override
	public void 키보드를연결해야한다() {
		// TODO Auto-generated method stub
		System.out.println("로지텍키보드를연결하다.");
	}

	@Override
	public void 모니터를연결해야한다() {
		// TODO Auto-generated method stub
		System.out.println("삼성모니터를연결하다.");
	}

	@Override
	public void 마우스를연결해야한다() {
		// TODO Auto-generated method stub
		System.out.println("레이저마우스를연결하다.");
	}

}
