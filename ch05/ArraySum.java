package ch05;

public class ArraySum {

	public static void main(String[] args) {
		int[] num = {10,20,30,40,50};
		int sum = 0;
		for(int i=0; i<num.length; i++) {
			sum += num[i];
			
		}
		System.out.println("합 : "+sum);
	}

}
