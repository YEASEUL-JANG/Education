package ch05;

import java.util.Scanner;

public class ArrayScanScore2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in) ;
		
		System.out.print("성적처리할 학생수를 입력하세요 : ");
		int m = in.nextInt();
		int n = 3;
		int[][] score = new int[m][n];
		System.out.println("국엉수점수를 각각 입력하세요");
		for(int i=0; i<m; i++) {
			System.out.println((i+1)+"번학생의 점수 : ");
			for(int j=0; j<n; j++) {
				score[i][j]=in.nextInt();
			}
		}
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");
		 for(int i=0; i<score.length; i++) {
			 int sum = 0;
			 float avg = 0.0f;
			 char grade = ' ';
			 
			 System.out.printf("%d\t",i+1);
			 for(int j=0; j<score[i].length; j++) {
				 sum += score[i][j];
				 System.out.printf("%d\t",score[i][j]);
			 }
			 avg = sum/(float)score[i].length;
			 
			 switch((int)(avg/10)) {
			 case 10:
			 case 9:
				 grade = 'A';
				 break;
			 case 8:
				 grade = 'B';
				 break;
			 case 7:
				 grade = 'c';
				 break;
			 case 6:
				 grade = 'd';
				 break;
			 default:
					 grade = 'F';
			 }
			 System.out.printf("%d\t%.1f\t%s%n",sum,avg,grade);
		 }
		
	}
}
		

