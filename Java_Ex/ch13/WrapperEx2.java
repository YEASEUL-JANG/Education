package ch13;

public class WrapperEx2 {

	public static void main(String[] args) {
		System.out.println(Character.toLowerCase('A'));
		char c1 = '4', c2='F';
		if(Character.isDigit(c1))
			System.out.println(c1+"는 숫차");
		if(Character.isAlphabetic(c2))
			System.out.println(c2+"는 문자");
		
		System.out.println(Integer.valueOf("200"));
		System.out.println(Integer.toString(200));
		System.out.println(Integer.toBinaryString(200));
		
		Integer i = new Integer(200);
		System.out.println(i.doubleValue());//정수를 double값으로 변환해줌.
		
		Double d = new Double(3.14);
		System.out.println((d.toString()));//Double을 문자열 "3.14"로 변환해줌
		
		boolean b = (4>3);
		System.out.println(Boolean.toString(b));//boolean형 true를 문자 "true"로 바꿈
		System.out.println(Boolean.valueOf("true"));
		
	}

}
