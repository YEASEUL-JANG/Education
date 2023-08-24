package ch10;
//static > 메모리의 특정한 static영역을 사용(객체 생성과는 별개로 무조건 자동적으로 메모리 로딩)
//non-static > 객체 생성된 후(new)에 로딩
//static method에서는 static 안의 로컬별수(일반변수)나 static으로 정의된 멤버변수만 사용가능.
public class A {
	//non-static 멤버변수
	String name = "kim";
	
	//static 멤버변수
	static int n = 20;
	
	//non-static 멤버메소드
	public void print() {
	System.out.println(name);
	System.out.println(n);
	}
	
	//메인메소드는 static메소드
	public static void main(String[] args) {
		int a = 10;
		double b = 20.5;
		System.out.println(a); //static 메소드의 로컬변수
		System.out.println(b); //static 메소드의 로컬변수
		System.out.println(n); //static변수
		
		A aa = new A(); //non-static멤버는 객체를 생성한 후에 사용가능하다.
		System.out.println(aa.name); 
		aa.print();
	}
	
	
	
}
