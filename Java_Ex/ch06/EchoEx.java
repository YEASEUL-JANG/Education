package ch06;

public class EchoEx {
	public static void echo(String s, int n) { // 매개변수 갯수, 데이터 타입을 반드시 맞춰줘야 함.
		for(int i=0; i<n; i++) {
			System.out.println(s);
		}
	}
	public static void main(String[] args) {
		echo("안녕!",3);
		
	}

}
