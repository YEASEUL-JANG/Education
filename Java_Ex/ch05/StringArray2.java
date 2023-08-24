package ch05;

public class StringArray2 {

	public static void main(String[] args) {
		String[] str = {"Java", "DB","JSP","Spring"};
//		for(int i=0; i<str.length;i++) {
//			System.out.println(str[i]);
		
		//for(데이터타입 개별값저장변수 : 집합변수)
		for(String ss : str) {
			System.out.println(ss);
		}
	}

}
