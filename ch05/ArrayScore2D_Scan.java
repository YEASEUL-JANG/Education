package ch05;

import java.util.Scanner;

public class ArrayScore2D_Scan {

	public static void main(String[] args) {
		int num = 0;
		char grade = ' ';
		Scanner in = new Scanner(System.in);
			System.out.println("학생수를 입력하세요 : ");
			 num = in.nextInt();
			 int[][] arr = new int[num][3];
			 
			System.out.println("국영수 점수를 각각 입력하세요");
			for(int i=0; i<arr.length; i++) {
				System.out.println(i+1+"번 학생의 국어점수 : ");
				arr[i][0]=in.nextInt();
				System.out.println(i+1+"번 학생의 영어점수 : ");
				arr[i][1]=in.nextInt();
				System.out.println(i+1+"번 학생의 수학점수 : ");
				arr[i][2]=in.nextInt();
		
		}
			
				
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t등급");	
		for(int i=0; i<arr.length; i++) {
			int sum = 0;
			float avg = 0.0f;
			
			System.out.printf("%d\t", i+1);
			for(int j=0; j<arr[i].length; j++) {
			sum += arr[i][j];
			System.out.printf("%d\t",arr[i][j]);
			
			}//inner
			avg = (float)sum/3.0f;
			
			if(avg>=90) {
				grade = 'A';
			}else if(avg>=80)  {
				grade = 'B';
			}else if(avg>=70)  {
				grade = 'C';
			}else if(avg>=60)  {
				grade = 'D';
			}else {
				grade = 'F';
			}
			
			System.out.printf("%d\t %.1f\t%s%n",sum,avg,grade);
		}//outer
			
}
}
