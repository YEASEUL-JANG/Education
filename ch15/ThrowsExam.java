package ch15;
//예외처리방법
//1) try-catch 직접처리
//2) throws 예외처리 클래스에 처리를 위임
// 메소드이름 throws 예외처리클래스1,2,... {} 로 처리가능
// main 메소드 내부의 코드를 실행하다가 예외가 발생하면 직접 try-catch하지말고 throws를 활용하는것이 편함.
public class ThrowsExam {

	public static void main(String[] args) throws InterruptedException {
		for(int i=1;i<10; i++) {
			System.out.println(i);
			Thread.sleep(1000);//Interrupt (cpu간섭)
		}
	}
}
