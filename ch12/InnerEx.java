package ch12;

class Outer{
	class Inner{
		int a=100;
	}//inner
	
	static class StraticInner{
		int a =200; //non-static
		static int b=300;//static
	}
	void method() {
		class LocalInner{
			int a=400;
		}
		LocalInner in = new LocalInner();
		System.out.println(in.a);
	}
}

public class InnerEx {
public static void main(String[] args) {
	Outer ou = new Outer(); //외부클래스 객체생성
	Outer.Inner in = ou.new Inner(); //내부클래스 객체생성
	System.out.println(in.a);//내부중첩클래스이용
	System.out.println(Outer.StraticInner.b); //내부 static 변수니까 객체생성 필요없음
	Outer.StraticInner st = new Outer.StraticInner();
	System.out.println(st.a);//내부 static클래스 이용
	ou.method();//지역클래스 이용
}
}
