package ch06;

public class PointEx {
	static String[] name = {"홍길동","이몽룡","성춘향","이순신","박지성"};
	static int[] kor = {100,90,80,95,85};
	static int[] eng = {80,90,80,60,90};
	static int[] mat = {90,55,90,60,40};
	static int[] tot = {0,0,0,0,0};
	static double[] avg = {0.0,0.0,0.0,0.0,0.0};
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
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i=0; i<5;i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
	}
	
	public static void main(String[] args) {
		getTot() ;
		getAvg();
		print();

	}

}
