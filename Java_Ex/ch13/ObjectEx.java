package ch13;

public class ObjectEx {
public static void main(String[] args) {
	ObjectEx e1 = new ObjectEx();
	System.out.println(e1.getClass());//클래스 정보값
	System.out.println(e1);
	System.out.println(e1.toString());//toString()은 Object를 문자열로 변환해서 표시
}
}
