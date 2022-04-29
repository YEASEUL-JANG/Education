package ch06;

public class ParamEx {
	static int plus(int a, int b) {
		return a+b;
	}
	static int minus(int a, int b) {
		return a-b;
	}
	static int multi(int a, int b) {
		return a*b;
	}
	static int devide(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		int n;
		n=plus(10,20);
		System.out.println("plus : "+n);
		n=minus(100,50);
		System.out.println("minus : "+n);
		n=multi(100,50);
		System.out.println("multi : "+n);
		n=devide(100,50);
		System.out.println("devide : "+n);
	}

}
