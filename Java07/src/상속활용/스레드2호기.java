package 상속활용;

public class 스레드2호기 extends Thread {
	@Override
	public void run() {
		String[] list = {"1호.png","2호.png","3호.png","4호.png","5호.png"};
		for (int i = 0; i < list.length; i++) {
			System.out.println("이미지" + list[i]);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	
	
	}
}
