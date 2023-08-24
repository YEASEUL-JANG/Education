package ch05;

import java.util.Scanner;

public class ArrayTest4 {

	public static void main(String[] args) {
		int total = 0;
		int size;
		Scanner in = new Scanner(System.in);
		System.out.println("배열의 크기를 입력하시오 : ");
		size = in.nextInt();
		
		int[] score = new int[size]; //변수로 배열의 크기를 지정할 수 있다. 
		for(int ss : score) {
			System.out.println("성적을 입력하세요 : ");
			score[ss] = in.nextInt();
		}
		for(int i=0; i<score.length; i++) {
			total += score[i];
			System.out.println(score[i]);
		}
		System.out.println("평균성적은 "+total/score.length+"입니다.");
	}

}
