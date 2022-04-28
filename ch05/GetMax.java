package ch05;

import java.util.Scanner;

public class GetMax {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int arr[] = new int[5];
		int max = 0;
		System.out.println("값을 입력하시오");
		for(int i=0; i<arr.length;i++) {
			arr[i] = in.nextInt();
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰수는"+ max+"입니다.");
	}

}
