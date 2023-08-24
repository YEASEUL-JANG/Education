package ch04;

public class BreakEx1 {

	public static void main(String[] args) {
		int i=1;
		while(true) {
			System.out.println(i++);
			if(i>10) break;
			
		}
		System.out.println("프로그램 종료");
	}

}
