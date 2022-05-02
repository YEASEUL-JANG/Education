package ch06;

public class OverleadEx3 {

	public static void main(String[] args) {
		print("홍길동", "hong@naver.com","01061255894");
		print("장예슬",98,95,85);
	}
	static void print(String name, String email, String hp) {
		System.out.println("==========================================");
		System.out.println("이름\t이메일\t전화");
		System.out.println(name+"\t"+email+"\t"+hp);
	}
	static void print(String name, int kor, int eng, int mat) {
		System.out.println("==========================================");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(name+"\t"+kor+"\t"+eng+"\t"+mat+"\t"+(kor+eng+mat)+"\t"+String.format("%.1f",(double)(kor+eng+mat)/3));
	}
}
