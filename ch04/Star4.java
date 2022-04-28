package ch04;

import java.util.Scanner;

public class Star4 {

	public static void main(String[] args) {
		System.out.println("홀수를 입력해주세요");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(i<=num/2) {
					if(i+j<=num/2-1)
						System.out.print(" ");
					else if(j-i>=num/2+1)
						System.out.print(" ");
					else
						System.out.print("*");
				}else if(i>num/2) {
					if(i-j>=num/2+1)
						System.out.print(" ");
					else if(i+j>=num/2*3+1)
						System.out.print(" ");
					else
						System.out.print("*");
				}//end else if
			}//end inner for
			System.out.println();
		}//end outer for
	}//main
}
