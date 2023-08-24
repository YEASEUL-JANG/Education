package ch04;

import java.util.Scanner;

public class ControlEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int menu = 0;
		int num = 0;
		Scanner in = new Scanner(System.in);
		
		outer :
		while(true) {
			System.out.println("(1) square(제곱)");
			System.out.println("(2) square root (제곱근)");
			System.out.println("(3)  log(로그)");
			System.out.print("원하는 메뉴(1-3)을 선택하세요.(종료:0)");
			String tmp = in.next();
			menu = Integer.parseInt(tmp); // 웹에서 숫자를 입력하면 문자로 인식함.
			if(menu==0) {
				System.out.println("종료");
				break;
			}else if(menu<1 || menu >3) {
				System.out.println("다시선택해라");
				continue;
			}
			for(;;) {// ;;  :  while문에서의 true와 같은 역할
			 System.out.println("계산할 값을 입력하세요.(계산종료 : 0, 전체종료 :  99)");
			tmp= in.next();
			num = Integer.parseInt(tmp);
			
			if(num==0)
				break;
			if(num==99)
				break outer;
			
			switch(menu) {
			case 1:
				System.out.println("result="+num*num);
				break;
			case 2:
				System.out.println("result="+Math.sqrt(num));
				break;
			case 3:
				System.out.println("result="+Math.log(num));
				break;
			}//switch
			
			}//end for
		}//end while
		System.out.println("전체 프로그램을 종료합니다.");
	}//main
}
