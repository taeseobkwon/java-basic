package 추상클래스인터페이스;

public class 컴퓨터사용 {

	public static void main(String[] args) {
		AppleComputer apple = new AppleComputer();
		apple.마우스를연결해야한다();
		apple.모니터를연결해야한다();
		apple.키보드를연결해야한다();
		System.out.println();
		BananaComputer banana = new BananaComputer();
		banana.마우스를연결해야한다();
		banana.모니터를연결해야한다();
		banana.키보드를연결해야한다();
		
	}

}
