package ch04;

import java.util.Scanner;

public class BreakAVG {

	public static void main(String[] args) {
		int total = 0;
		int count = 0;
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("점수를 입력하세요 : ");
			int grade = in.nextInt();
			if(grade<0) {
				break;
			}
			total += grade;
			count++;
		}
		System.out.println("평균은 " + total/count);
		in.close();
	}

}
