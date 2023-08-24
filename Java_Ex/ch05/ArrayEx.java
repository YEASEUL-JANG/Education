package ch05;

public class ArrayEx {

	public static void main(String[] args) {
//		int[] score;// 배열참조변수 선언
//		score = new int[5]; //new를 통해 메모리에 5개의 int 형
//		System.out.println(score);
//		score[0]= 100;
//		score[1]= 90;
//		score[2]= 80;
//		score[3]= 70;
//		score[4]= 60;
		
		int[] score = {100,90,80,70,60};
		
		for(int i=0; i<score.length; i++) {
		System.out.println(score[i]);
	}
	}
}

