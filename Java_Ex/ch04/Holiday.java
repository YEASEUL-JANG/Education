package ch04;

import java.util.Scanner;

//휴가일수 계산
//근속연수 1~3년 >> 3일휴가
//근속연수 4~9년 >> 5일휴가
//       10년이상 >> 10일
//       20년이상 >> 20일
public class Holiday {

	public static void main(String[] args) {
		int year;
		int days;
		
		Scanner in = new Scanner(System.in);
		System.out.println("근속연수를 입력하시오 : ");
		year = in.nextInt();
		if(year <= 3) {
			days = 3;
		}else if(year < 10) {
			days = 5;
		}else if(year < 20) {
			days = 10;
		}else {
			days = 20;
		}
		System.out.println("당신의 근속연수는 "+year+"년이고");
		System.out.println("휴가일수는 "+days+"입니다.");
	}

}
