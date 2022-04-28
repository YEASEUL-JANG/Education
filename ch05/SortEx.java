package ch05;

import java.util.Arrays;
import java.util.Collections;

public class SortEx {

	public static void main(String[] args) {
		int num[] = {29,1,81,70,13,92,36};
		Arrays.sort(num); //오름차순으로 
		for(int i : num) {
			System.out.print(i +" ");
		}
		System.out.println();
		// 내림차순으로
		Integer rev[] = {29,1,81,70,13,92,36};
		Arrays.sort(rev, Collections.reverseOrder());
		for(int i : rev) {
			System.out.print(i + " ");
		}
	}
}
