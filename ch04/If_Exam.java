package ch04;

import java.util.Scanner;

public class If_Exam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
		int score = scan.nextInt();
		
		String result = "";  //널문자
		if(score >= 60) {
			result = "합격";
		}else {
			result = "불합격";
		}
		System.out.println(result);
}
}

