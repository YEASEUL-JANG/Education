package ch06;

public class VoidExam {
	public static int Hello(int a) {
		int result = 0;
		for(int i=1; i<=a; i++) {
			result += i;
		}
			return result; //메소드를 호출한 곳으로 값을 반환함
	
	}
	public static void main(String[] args) {
		int n = Hello(50); //sum메소드 호출 후 리턴받은 값을 n에 저장함.
		System.out.println(n);
		n= Hello(100);
		System.out.println(n);
		
		
	}

}
