package ch10;

class T {
	private int num = 10;
	public void print() {
		System.out.println(num);
	}
}


public class FinalMethod2 extends T{
	int num = 100;
	public void print() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		FinalMethod2 f = new FinalMethod2();
		f.print();
	}
}
