package ch14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam_Hashset {

	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		//set은 중복값을 허용하지 않음 , 순서없음
		hs.add("korea");
		hs.add("japan");
		hs.add("america");
		hs.add("britain");
		hs.add("korea");
		System.out.println(hs);
		for(String str : hs) {
			System.out.println(str);
		}
		
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {//다음 요소가 있으면 true
			System.out.println(it.next()); //다음요소를 꺼님
		}
		
	}

}
