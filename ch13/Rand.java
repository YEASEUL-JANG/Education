package ch13;

import java.util.Random;

public class Rand {

	public static void main(String[] args) {
		Random r = new Random();
		System.out.println(r.nextDouble());
		System.out.println(r.nextInt());//임의의 정수
		System.out.println(r.nextInt(100)); //0부터 99까지
		System.out.println(r.nextInt(101)+100); //100부터 200까지
		System.out.println(Math.random()); //0.0~1.0 미만 실수값
		int num = (int)(Math.random()*100);
		System.out.println(num);
		String[] prize = {"1등","2등","3등","다음기회에"};
		System.out.println(prize[r.nextInt(4)]); //0~3까지
		
	}

}
