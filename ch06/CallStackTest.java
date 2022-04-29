package ch06;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
		System.out.println("끝");
	}

	private static void firstMethod() {
		secondMethod();
		System.out.println("firstMethod");
	}

	private static void secondMethod() {
		System.out.println("secondMethod");
	}

}
