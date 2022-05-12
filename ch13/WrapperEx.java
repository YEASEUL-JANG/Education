package ch13;

//WrapperClass : 기본자료형을 포장하는 클래스
public class WrapperEx {
	public static void main(String[] args) {
		Integer i1 = 10;
		Integer i2 =new Integer(20);
		int num1 = i1.intValue();//기본타입
		int num2=i2; //객체타입
		int sum = num1+num2;
		System.out.println(sum); //데이터 타입이 다른것끼리 더함.
		
		System.out.println(Integer.toBinaryString(sum));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.valueOf("100"));
		System.out.println(Integer.toString(100));//정수를 문자로 바꿔줌
		
	}

}
