package ch06;

public class StudentPoint {
	static int[] number = {1001,1002,1003};
	static String[] name = {"홍길동","이몽룡","이순신"};
	static int[] kor = {100,90,80};
	static int[] eng = {80,90,80};
	static int[] mat = {90,55,90};
	static int[] tot = {0,0,0};
	static double[] avg = {0.0,0.0,0.0};
	
	static void getTot() {
		for(int i=0; i<name.length; i++) {
			tot[i] = kor[i]+eng[i] + mat[i];
		}
	}
	static void getAvg() {
		for(int i=0; i<name.length; i++) {
			avg[i] = tot[i]/3.0;
		}	
	}
	static void print() {
		System.out.println("전체학생수 : "+name.length+"명");
		System.out.println("--------------------------------------------------------");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("--------------------------------------------------------");
		for(int i=0; i<name.length;i++) {
			System.out.println(number[i]+"\t"+name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		System.out.println("--------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		getTot() ;
		getAvg();
		print();

	}
}
