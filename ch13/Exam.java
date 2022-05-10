package ch13;
/*
 * 객체를 통하지 않고 변수처리 - string pool영역 (문자내용이 같으면 같은 주소값을 가짐)
 * 일반객체처럼 new를 통해 객체처리 - heap 영역(문자내용이 같아도 다른 주소값을 가짐)
 */
public class Exam extends Object{
public static void main(String[] args) {
	String a="hello";//메모리상에는 string pool영역에서 다루어짐
	System.out.println(System.identityHashCode(a));
	String b ="hello";
	System.out.println(System.identityHashCode(b));
	//string pool 영역안의 문자열을 다룰때는 같은 문자열이면 참조변수가 다르더라도 같은 주소값을 가리킨다.
	System.out.println(a==b);//주소값 비교
	System.out.println(a.equals(b));// 내용비교
	
	String c = new String("hello"); //new를 하면 heap영역의 새로운 주소값을 가짐
	System.out.println(System.identityHashCode(c));
	
	String d = new String("hello");
	System.out.println(System.identityHashCode(d));
	System.out.println(c==d);//주소값비교
	System.out.println(c.equals(d));//내용비교
}
}
