package ch02;

import java.util.Scanner;

public class RectangelTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x,y;
		double area;
		
		System.out.println("==================================");
		System.out.print("직사각형의 가로 길이를 입력하세요 : ");
		x = input.nextInt();
		System.out.print("직사각형의 세로 길이를 입력하세요 : ");
		y = input.nextInt();
		
		area = x*y;
		System.out.println("직사각형의 넓이는 " + area + "입니다.");
		System.out.println("==================================");
	}

}
