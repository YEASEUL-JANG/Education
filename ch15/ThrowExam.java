package ch15;
//throw : 예외를 직접 발생시킴. test용 외에는 거의 쓸일 없음
public class ThrowExam {
	static void test(int n) {
		if(n==0) {
			//throw new 예외처리클래스() : 특정조건에 인위적으로 예외를 발생시킨
			throw new NullPointerException();
			
		}
	}
	public static void main(String[] args) {
		test(0);
	}

}
