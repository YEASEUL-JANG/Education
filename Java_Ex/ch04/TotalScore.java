package ch04;

import java.util.Scanner;

public class TotalScore {

	public static void main(String[] args) {
		int kor,eng,mat,tot;
		double avg;
		String grade;
		String score = "";
		for(int i=1; i<=3;i++) {
			Scanner in = new Scanner(System.in);
			System.out.print("국어점수 : ");
			kor = in.nextInt();
			System.out.print("영어점수 : ");
			eng = in.nextInt();
			System.out.print("수학점수 : ");
			mat = in.nextInt();
			System.out.println();
			
			tot = kor+eng+mat;
			avg = tot/3.0;
			
			if((int)avg>=90) {
				grade = "수";
			}else if((int)avg>=80) {
				grade = "우";
			}else if((int)avg>=70) {
				grade = "미";
			}else {
				grade = "가";
			}
			score += String.format("%d\t%d\t%d\t%d\t%.1f\t%s\n",kor,eng,mat,tot,avg,grade);
			
	}
		System.out.println();
		System.out.println("============================================");
		System.out.println("국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("--------------------------------------------");
		System.out.print(score);
		System.out.println("============================================");

}
}