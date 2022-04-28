package ch04;

public class OddEx {

	public static void main(String[] args) {
		int sum = 0;
			for(int i=1; i<=10 ;i++) {
				if((i%2)!= 0) {
					sum += i;
			}//end if
		}
			System.out.print("1~10사이의 홀수의 합은 "+sum);
	}

}
