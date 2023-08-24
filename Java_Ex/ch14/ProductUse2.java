package ch14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductUse2 {

	public static void main(String[] args) {
		List<Product2> list = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		String s;
		Product2 p;
		Outer :
		while(true) {
			
				System.out.println("제품정보를 입력해보세요.(계속 : 아무문자, 나가기 : 0)");
				s=in.next();
				if(s.equals("0")) {
					System.out.println("종료합니다.");
					break Outer;
				}else {
				p = new Product2();
				p.input();
				list.add(p);
				p=null;
				}//if
				}//while
		
		System.out.println("---------------------------------------------------------------------");
		System.out.println("제품번호\t제품명\t제조사\t제조일자\t단가(천원)\t수량\t금액");
		System.out.println("----------------------------------------------------------------------");
		for(int i=0;i<list.size();i++) {
			Product2 t = list.get(i);
			System.out.println(t.getProduct_num()+"\t"+t.getName()+"\t"+t.getMaker()+"\t"+t.getDate()+"\t"
			+String.format("%,d",t.getMoney())+"\t"+t.getNum()+"\t"+String.format("%,d",t.getTotal_money()));
		}//for
		System.out.println("----------------------------------------------------------------------");
}//main
}