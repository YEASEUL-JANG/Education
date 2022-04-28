package ch04;

public class For_sum {

	public static void main(String[] args) {
		int total = 0;
		for(int i =1; i<=100; i++) {
			total += i;
			if(i%10==0) {
				System.out.println("1부터 "+i+"까지의 자연수 합계는 "+total);
			}//end if
		}// end for
	}//end main

}
