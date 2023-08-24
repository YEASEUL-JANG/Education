package ch14;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
public static void main(String[] args) {
	//list : 순서대로 저장, map : 순서가 없고, 키/값 으로 처리.
	Map<String,String> map = new HashMap<>();
	//Map<key자료형, value자료형>
	map.put("한국", "서울"); //map.put(key,value)로 데이터 추가 (리스트의 add와 같은기능)
	System.out.println(map.get("한국")); //get 메소드는 키값을 넣어 출력함
	
	map.put("일본", "동경");
	map.put("중국","북경");
	map.put("미국", "워싱턴");
	System.out.println(map);
	String nation = "중국";
	System.out.println(nation+"의 수도는 "+map.get(nation));
	
	//Iterator : 반복처리를 위한 객체( for문과 유사)
	Iterator<String> iterator = map.keySet().iterator();
	while(iterator.hasNext()) {//다음요소가 있으면 true
		String key = (String)iterator.next();
		System.out.print("key = "+key);
		System.out.println(", value = "+map.get(key));
	}
}
}
