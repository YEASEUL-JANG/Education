package ch04;

import java.util.Scanner;

public class While_Gugu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("구구단 중에서 출력하고 싶은 단을 입력하세요 : ");
		int dan=in.nextInt();
		int j=1;
			System.out.println("** "+dan+"단 **");
			while(j<=9) {
				System.out.println(dan+" x "+j+" = "+dan*j);
				j++;
			}
			j=1; 
	}
	}

