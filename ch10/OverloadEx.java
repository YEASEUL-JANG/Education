package ch10;

public class OverloadEx {
	//overlead: 메소드이름은 같고 매개변수 갯수나 자료형이 다른것.
	public void putData(String a) {
		System.out.println(a);
	}
	public void putData(int a) {
		System.out.println(a);
	}
	public void putData(double a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		OverloadEx o = new OverloadEx();
		o.putData("hello");
		o.putData(21);
		o.putData(21.3);
	}

}
