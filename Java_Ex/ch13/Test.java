package ch13;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		System.out.println(Math.ceil(10.1)); //올림
		System.out.println(Math.round(10.5)); //반올림
		System.out.println(Math.floor(10.9));//버림
		System.out.println((int)(Math.random()*100));//100이하 난수
		Random rand = new Random();//랜덤클래스 객체생성
		System.out.println("정수 : "+ rand.nextInt(100));//100이하 난수(정수)
		System.out.println("실수 : "+ rand.nextDouble());//1이하 난수(실수)
		
		
		
		
		
		
		
		
		
		
//		int a=10;
//		Integer b=20; //객체이지만 
//		Integer c = new Integer(30); //정석
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c.intValue());
	}

}
