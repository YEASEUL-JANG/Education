package ch10;

public class StaticVar {
	static int a = 10;
	int b=20;
	
	public static void main(String[] args) {
		System.out.println(StaticVar.a); //static 멤버는 "클래스이름.static멤버" 로 접근해 사용가능
		
		StaticVar s = new StaticVar();
		System.out.println(s.b);
		
	}

}
