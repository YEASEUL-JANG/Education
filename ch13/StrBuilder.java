package ch13;

public class StrBuilder {

	public static void main(String[] args) {
		//string은 불변(원본은 삭제가 안됨) - 메모리를 많이 차지함.
		//따라서 값이 변할 수 있는 Stringbuffer 나 StringBuilder를 사용함
		
		StringBuilder str = new StringBuilder();
		str.append("java");//append는 문자열 내용을 추가함. (string보다 메모리 절약기능이 있음)
		System.out.println(str.toString()); //string화해줘야 함.
		str.append(" programming");//append는 문자열 내용을 추가함. (string보다 메모리 절약기능이 있음)
		System.out.println(str.toString());
		
		str.replace(0, 4, "jsp");//0~3까지 인덱스 내용을 변경함
		System.out.println(str.toString());
		
		String str1 = str.substring(3);//인덱스 3부터 끝까지
		System.out.println(str);
		System.out.println(str1);
		
		//StringBuilder를 String으로 바꿀때는 toString을 사용
		String str2 = str.toString(); 
		System.out.println("stringbuilder(str)->string(str2)에 저장 :"+str2);
		
		//String을 StringBuilder에 저장(초기화)
		str = new StringBuilder(str2);
		System.out.println("string(str2)=>stirngbuilder(str)에 저장 : "+str);
		
		
	}
}
