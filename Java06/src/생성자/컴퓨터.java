package 생성자;

public class 컴퓨터 {
	int price;
	String make;
	double size;
	
//	public 컴퓨터(int price, String make, double size) {
//		this.price = price;
//		this.make = make;
//		this.size = size;
//	}

	public 컴퓨터(int price, String make, double size) {
		this.price = price;
		this.make = make;
		this.size = size;
	}

	@Override
	public String toString() {
		return "컴퓨터 [price=" + price + ", make=" + make + ", size=" + size + "]";
	}
	
	
	
}
