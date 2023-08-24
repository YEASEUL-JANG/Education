package ch04;

import java.util.Scanner;

public class Nested_if_Score {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' '; // ''사이를 한칸 떨어뜨림
		char lev = '0'; 
		
		Scanner in = new Scanner(System.in);
		System.out.println("Java 점수 : ");
		score =  in.nextInt();
		in.close();
		
		if(score >90) {
			grade = 'A';
			if(score>97) {
				lev = '+';
			}else if(score<94) {
				lev = '-';
			}
		}else if(score > 80) {
			grade = 'B';
			if(score>87) {
				lev = '+';
			}else if(score<84) {
				lev = '-';
			}
		}else {
			grade = 'F';
			System.out.println("재수강 대상입니다.");
		}
		
		System.out.println("당신의 점수는 "+score+"이고 등급은 "+grade+lev+"입니다.");
	}//main

}
