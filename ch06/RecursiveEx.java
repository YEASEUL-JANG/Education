package ch06;

//재귀호출 : 팩토리얼 계산시 활용.
public class RecursiveEx {

	public static void main(String[] args) {
		System.out.println(fact1(5));
		
	}

	static long fact1(int n) {
		return n==1? 1: n*fact1(n-1);
	}

}
