package ch04;

public class While2 {

	public static void main(String[] args) {
		int i=1;
		int num=10;
		int sum=0;
		while(i<=num) {
			sum +=i;
			i++;
			// 위의 두줄을 sum += i++; 한줄로 바꿀수 있음
		}
		System.out.println("1~"+num+"까지의 합계 :"+sum);
	}

}
