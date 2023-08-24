package ch05;

import java.util.Scanner;

public class InputSum {

	public static void main(String[] args) {
		int[] num = new int[5];
		int sum = 0;
		Scanner in = new Scanner(System.in);
		for(int i=0;i<num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 하세요");
			num[i]= in.nextInt();
			sum += num[i];
		}
		System.out.println("합계 : "+sum);
	}

}
