package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EcUse {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<EC> list = new ArrayList<>(); 
		list.add(new EC(1234,"2022-05-13","티셔츠","삼성","37918789468",55900));
		list.add(new EC(2345,"2022-04-11","컴퓨터","롯데","15918123498",2555000));
		list.add(new EC(3456,"2022-05-05","커피","현대","27918123468",12000));
		
		
		map.put("list", list);
		print(map);
	}
	static void print(Map map) {
		ArrayList<EC> list2 = (ArrayList<EC>)map.get("list");
		System.out.println("-----------------------------------------------------------------");
		System.out.println("주문번호\t주문일자\t\t주문상품\t카드명\t카드번호\t\t결제금액");
		System.out.println("-----------------------------------------------------------------");
		for(EC s : list2) {
			System.out.println(s.getNo()+"\t"+s.getOrderDate()+"\t"+s.getProduct()
			+"\t"+s.getCardName()+"\t"+s.getCardNo()+"\t"+String.format("%,d", s.getPay()));
		}
		System.out.println("-----------------------------------------------------------------");
	}
}
