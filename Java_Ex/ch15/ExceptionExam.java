package ch15;

public class ExceptionExam {
	//에러 - 컴파일 오류(실행자체가 아님)
	//경고 - 에러는 아니지만 잠재적인 문제를 안고있음
	//예외 - 실행을 하면서 오류가 발생하는 경우
	//  ex) 다운로드를 시도 ==> 파일이 없음
	//예외처리방법 - try catch  직접처리
	
	public static void main(String[] args) {
		int a=10, b=0, c;
		try {//예외가 발생할 가능성이 있는 코드
			c=a/b; //분모가 0이면 에러
			System.out.println(c);
		} catch (ArithmeticException e) {//잘 모를 땐, 모든 예외의 조상 = Exception으로 적어도 됨.
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();
		
		}
		System.out.println("프로그램 종료.");
	}
	
	
}
