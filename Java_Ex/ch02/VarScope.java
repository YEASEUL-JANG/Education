package ch02;

public class VarScope {
	static int x; // 전역변수는 초기화하지 않더라도 자동초기화
	
	public static void main(String[] args) {
		int y = 0;
		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}
