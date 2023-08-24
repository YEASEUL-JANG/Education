package ch06;

import java.util.Scanner;

public class GuguEx {

	public static void main(String[] args) {
		int dan;
		System.out.println("단을 입력하세요 : (2~9단)");
		Scanner in = new Scanner(System.in);
		dan = in.nextInt();
		gugu(dan);
		guguAll();
	}	
	static void gugu(int dan) {
		System.out.println("==첫번째 gugu메소드 활용==");
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"x"+i+" = "+dan*i);
		}
	}
	static void guguAll() {
		System.out.println("==두번째 guguAll메소드 활용==");
		for(int i=2; i<=9; i++) {
			System.out.println();
			System.out.println("**"+i+"단**");
			for(int j=1; j<=9; j++) {
				System.out.println(i+"x"+j+"="+i*j);
			}
		}
	}
	
}
