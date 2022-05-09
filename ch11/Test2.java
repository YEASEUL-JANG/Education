package ch11;

public class Test2 extends Test{
	public void print() {//완성메소드로 간주
		//구현부, body
		System.out.println("추상클래스를 상속받아 구현함.");
	}
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
	}
}


abstract class Test {//abstract 메소드가 하나이상 포함되었으므로 abstract class로 변경해야함.
	public void input() {
		System.out.println("input메소드"); //일반메소드
	}
	public abstract void print(); //추상메소드( 구현부{}가 없음 )
}
