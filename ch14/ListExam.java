package ch14;

import java.util.ArrayList;
import java.util.List;
//ArrayList : 벡터와 사용법이 비슷하지만 좀 더 가볍고 속도가 빠름
public class ListExam {
public static void main(String[] args) {
	//ArrayList<Object> list = new ArrayList<>();
	List<Object> list = new ArrayList<>(); //실무에서는 거의 좌변은 부모, 우면은 자식 (다형성기법)으로 사용함.
	list.add("하나");
	list.add(2);
	list.add(5.5);
	list.add(false);
	list.remove(0);
	for(int i=0;i<list.size();i++) {
		System.out.print(list.get(i)+"\t");
	}
}
}
