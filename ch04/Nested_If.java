package ch04;

import java.util.Scanner;

public class Nested_If {

	public static void main(String[] args) {
		int a, b;
		Scanner in = new Scanner(System.in);
		System.out.println("임의의 정수를 입력하시오 : ");
		a = in.nextInt();
		System.out.println("범위로 쓸 정수를 입력하시오 : ");
		b = in.nextInt();
		in.close();
		
		if(a>b) {
			if((a%2)==0) {
				System.out.println(a+"은"+b+"보다 큰 짝수");
			}else {
				System.out.println(a+"은"+b+"보다 큰 홀수");
			}
		}else {
			if((a%2)==0) {
				System.out.println(a+"은"+b+"보다 작은 짝수");
			}else {
				System.out.println(a+"은"+b+"보다 작은 홀수");
			}
		}
	}

}
