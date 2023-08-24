package ch10;

public class Test {
	static int a;
	int b;
	void print() {
		System.out.println(a); //non-static멤버 안에서는 static멤버를 얼마든 사용가능함.
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		System.out.println(a);
		Test b = new Test();
		System.out.println(b.b);
//		b = null; // null하면 참조변수는 주소를 잃고 메모리에서 해당객체가 떠돌아다님
//		System.out.println(b);
		b.print();
	}
}
