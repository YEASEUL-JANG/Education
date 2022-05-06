package ch10;
//final 변수
//1) 값 변경불가
//2) 초기값이 반드시 설정되어야함
//3) 대문자로 작성.
public class FinalVar {
	//final변수는 전역변수화 해도 선언만하면 에러, 값을 넣어줘야함 , 값도 변경불가
	final static int MAX_NUM = 500;
	
	public static void main(String[] args) {
		int max = 100;
		System.out.println(max);
		System.out.println(MAX_NUM);
		
	}

}
