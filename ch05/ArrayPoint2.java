package ch05;

import java.util.Scanner;

public class ArrayPoint2 {

	public static void main(String[] args) {
		String[] name = new String[2];
		int[] kor = new int[2];
		int[] eng = new int[2];
		int[] mat = new int[2];
		
		int[] tot = {0,0};
		double[] avg = new double[2];
		double tot_avg =0;
		
		Scanner in = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			System.out.print("이름을 입력하세요 : ");
			name[i]=in.next();
			System.out.print("국어점수를 입력하세요 : ");
			kor[i]=in.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			eng[i]=in.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			mat[i]=in.nextInt();
		
			tot[i]=kor[i]+eng[i]+mat[i];
			avg[i]=tot[i]/3.0;
			tot_avg = tot_avg+ avg[i];
			
		}
		
		for(int i=0; i<2; i++) {
			System.out.println("이름 : "+ name[i]);
			System.out.println("국어 : "+ kor[i]);
			System.out.println("영어 : "+ eng[i]);
			System.out.println("수학 : "+ mat[i]);
			System.out.println("총점 : "+ tot[i]);
			System.out.println("평균 : "+ String.format("%.1f",avg[i]));
			System.out.println();
		}
		System.out.println();
		System.out.println("================================");
		System.out.println("학급평균 : "+String.format("%.1f", tot_avg/2));
	}

}
