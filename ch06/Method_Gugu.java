package ch06;

import java.util.Scanner;

public class Method_Gugu {

	public static void main(String[] args) {
		int dan;
		System.out.println("단을 입력하세요 : ");
		Scanner in = new Scanner(System.in);
		dan = in.nextInt();
		gugu(dan);
	}	
	static void gugu(int dan) {
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+"="+dan*i);
		}
	}

}
