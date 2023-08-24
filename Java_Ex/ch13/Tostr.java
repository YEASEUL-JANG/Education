package ch13;

public class Tostr {

	public static void main(String[] args) {
		Object o = new Object();
		o=20; //참조변수에는 원래 주소값이 들어가나, jdk1.5부터 value가 들어갈 수 있게 내부처리됨.(intValue()) = 오토박싱 )
		System.out.println(o);// 오토 언박싱처리
		
		o=new Double(20.5);
		System.out.println(o);
		
		o="hello";
		System.out.println(o);
	}

}
