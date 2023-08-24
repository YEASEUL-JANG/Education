package ch06;

public class OverleadEx4 {

	public static void main(String[] args) {
		print("홍길동", "hong@naver.com","01061255894");
		print("홍길동",6000);
	}
	static void print(String name, String email, String hp) {
		System.out.println("==============================================");
		System.out.println("이름\t이메일\t전화");
		System.out.println(name+"\t"+email+"\t"+hp);
	}
	static void print(String name, int salary) {
		System.out.println("==============================================");
		System.out.println("이름\t급여\t세금\t실수령액");
		System.out.println(name+"\t"+salary+"\t"+(int)(salary*0.3)+"\t"+(int)(salary-(salary*0.3)));
	}
}


