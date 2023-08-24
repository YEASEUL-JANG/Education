package ch15;

public class Test {

	public static void main(String[] args) {
		try {
			int num = Integer.parseInt("AB");//영문자를 숫자화 할 수 없다.
			System.out.println(num);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력하세요.");
		}
	}
}
