package ch05;

import java.util.Scanner;

public class ArrayScanScore {

	public static void main(String[] args) {
		int number=0;
		int sum = 0;
		
		Scanner n= new Scanner(System.in);
		System.out.println("성적처리할 학생수를 입력하시오");
		number = n.nextInt();
		int intArray[] = new int[number];
		
		for(int i =0; i<intArray.length; i++) {
			System.out.println("성적을 입력하시오");
			intArray[i] = n.nextInt();
			sum += intArray[i];
		
		}
		System.out.println("총점은 " + sum+"점 입니다.");
		System.out.println("평균성적은 "+ String.format("%.1f",(double)sum/intArray.length)+"점 입니다.");
		
	}
	}

