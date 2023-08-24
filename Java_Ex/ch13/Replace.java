package ch13;

public class Replace {
public static void main(String[] args) {
	String a = "java program";
	System.out.println(a.replace("a", "A"));
	System.out.println(a); // String의 불변성으로 인해 실제 값은 안바뀜.
	
	a=a.replace("a", "A"); //주소값을 바꿔버림
	System.out.println(a);
}
}
