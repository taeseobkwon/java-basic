package 상속;

public class 매니저 extends 직원{
	int bonus;
	public void test() {
		System.out.println("매니저업무입니다.");
	}
	@Override
	public String toString() {
		return "매니저 [bonus=" + bonus + ", name=" + name + ", address=" + address + ", salary=" + salary + ", rrn=" + rrn
				+ "]";
	}
	

}
