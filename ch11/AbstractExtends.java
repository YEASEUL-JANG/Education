package ch11;

public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {// 상속받으면서 미구현된 메소드를 구현해야함.
		System.out.println("추상클래스 구현");
	}
	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}
	
}
