package ch04;

import java.util.Scanner;

public class While_Point2 {

	public static void main(String[] args) {
		int count = 0;
		int sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 영어 수학 점수를 각각 입력하고 마지막에 -1을 입력하세요.");
		
		int n = scanner.nextInt();
		while(n != -1) { //-1이 입력되면 while문 벗어남
			sum += n;
			count++;
			n = scanner.nextInt(); //(-1입력용)
		}
		if(count == 0) {
			System.out.println("입력된 수가 없습니다.");
			
		}else {
			System.out.println("총점은 "+sum+"입니다.");
		}

}
}