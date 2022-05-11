package ch13;

public class StringExam {
public static void main(String[] args) {
	String str1 = new String("Hello World"); //heap영역
	String str2 = new String("Hello World"); //heap영역
	
	System.out.println(System.identityHashCode(str1));
	System.out.println(System.identityHashCode(str2));
	
	if(str1==str2) {//주소값 비교
		System.out.println("같은 인스턴스를 참조합니다.");
	}else {
		System.out.println("다른주소값을 참조합니다.");
	}
	if(str1.equals(str2)) {
		System.out.println("같은 내용입니다.");
	}else {
		System.out.println("다른내용입니다.");
	}
}
}
