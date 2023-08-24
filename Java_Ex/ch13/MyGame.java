package ch13;

import java.util.Random;
import java.util.Scanner;

public class MyGame {

	public static void main(String[] args) {
		Random r = new Random();
		String game[] = {"가위","바위","보"};
		String com = "";
		String a = "";
		Scanner in = new Scanner(System.in);
		
		Outer:
		while(true) {
			com = game[r.nextInt(3)];
			System.out.print("가위, 바위, 보 중 하나를 입력하세요 : (종료는 exit 입력)");
			a = in.next();
			
			if(com.equals(a)) {
				System.out.println("컴퓨터와 같은걸 내셨습니다. 동점입니다.");
				continue ;
			}else if(a.equals("exit")) {
				System.out.println("Game Exit..");
				break Outer;
			}

			switch (com) {
			case "가위":
				if(a.equals("바위")) {
					System.out.println("축하합니다. 이겼습니다.(컴퓨터 : "+com+")");
				}else {
					System.out.println("지셨습니다. 컴퓨터는 "+com+"입니다.");
				}
				break ;
			case "바위":
				if(a.equals("보")) {
					System.out.println("축하합니다. 이겼습니다.(컴퓨터 : "+com+")");
				}else {
					System.out.println("지셨습니다. 컴퓨터는 "+com+"입니다.");
				}
				break ;
			case "보":
				if(a.equals("가위")) {
					System.out.println("축하합니다. 이겼습니다.(컴퓨터 : "+com+")");
				}else {
					System.out.println("지셨습니다. 컴퓨터는 "+com+"입니다.");
				}
				break ;
			}// end switch
			}// end while
		}// end main
}
	


