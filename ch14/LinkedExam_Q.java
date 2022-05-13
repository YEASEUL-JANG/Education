package ch14;

import java.util.LinkedList;

public class LinkedExam_Q {

	public static void main(String[] args) {
		//큐 구조 : 먼저들어간게 먼저나옴
		//입력 : offer, 출력 poll
		String[] fruits = {"사과","배","포도","딸기","수박"};
		LinkedList list = new LinkedList();//링크드리스트가 큐 구조를 주로 사용
		for(String str : fruits) {
			list.offer(str);//큐 구조에 자료 입력
			
		}
		String str1 = "";
		while((str1=(String)list.poll()) != null) {
			System.out.println(str1+ " 삭제되었습니다.");
		}
		
	}

}
