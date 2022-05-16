package ch14;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListProdEx {

	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		List<ProdEx> list = new ArrayList<>(); //ProdEx클래스 안의 변수에 해당되는 자료형만 사용하겠다.
		list.add(new ProdEx("TV","LG01TV","LG",300,10));
		list.add(new ProdEx("냉장고","LG02RE","LG",400,3));
		list.add(new ProdEx("에어컨","LG03CO","LG",100,1));
		list.add(new ProdEx("컴퓨터","LG04COM","LG",200,20));
		
		map.put("list", list);//맵에 리스트 추가함
		print(map);//맵을 받아서 처리하는 print메소드
	}
	static void print(Map map) {
		ArrayList<ProdEx> list2 = (ArrayList<ProdEx>)map.get("list");
		//맵에 집어넣은 후 꺼낼때 다시 리스트에 넣어서 꺼냄
		//맵과 리스트는 이종의 데이터 타입이므로 형변환해줘야 함. 받은쪽이 우선이므로 list타입으로 형변환 함.
		System.out.println("----------------------------------------------");
		System.out.println("제품명\t제품번호\t제조사\t단가\t수량\t판매금액");
		System.out.println("----------------------------------------------");
//		for(ProdEx s : list2) {
		for(int i=0; i<list2.size();i++) {
			ProdEx s = list2.get(i);
			System.out.println(s.getName()+"\t"+s.getNum()+"\t"+s.getCompany()
			+"\t"+s.getPrice()+"\t"+s.getAmount()+"\t"+s.getMoney());
		}
		System.out.println("----------------------------------------------");
	}
}
