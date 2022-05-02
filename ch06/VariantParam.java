package ch06;

public class VariantParam {
	static void print(String ... n) { //n이 가변형 매개변수
		// 자료형 ... 변수 => 가변사이즈 매개변수. 변수가 배열참조변수가 됨
		// 같은 자료형의 매개변수의 갯수에 관계없이 처리됨.
		// 매개변수들이 배열로 저장됨.
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	public static void main(String[] args) {
		print("java");
		print("java","program");
		print("java","program","jsp");
		print("java","program","jsp","spring");
	}

}
