package ch04;

import java.util.Scanner;

public class Cost {

	public static void main(String[] args) {
		String name="";
		int price = 0;
		int point = 0;
		int point_use = 0;
		int fee = 0;
		int pay;
		
		Scanner in = new Scanner(System.in);
		System.out.print("이름 : ");
		name = in.next();
		System.out.print("구매금액 : ");
		price = in.nextInt();
		System.out.print("보유포인트 : ");
		point = in.nextInt();
		
		if(price<20000) {
			fee=2000;
		}
		if(point >=10000) {
			point_use = point;
			pay = price+fee-point;
		} else {
			pay = price+fee;
		}
		
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t결제금액");
		System.out.println(name+"\t"+price+"\t"+fee+"\t"+point_use+"\t"+pay);
	}

}
