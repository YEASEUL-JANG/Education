package ch12;
/*
 * 클래스안의 멤버변수를 선언하는 위치에 선언되는 경우 중첩클래스 or 인스턴스 클래스라고 함.
 * 외부클래스격인 InnerExam1을 먼저 생성한 후
 * InnerExam.Cal cal = t.new Cal(); 과 같은 방법으로 내부클래스 객체를 생성함.
 */
public class InnerExam1 {
	class Cal{
		int value = 0;
		public void plus() {
			value++;
		}
	}
	public static void main(String[] args) {
		InnerExam1 t = new InnerExam1(); // 1. 외부클래스를 먼저 인스턴스화 함
		InnerExam1.Cal cal = t.new Cal(); // 2. 내부클래스 객체생성.
		cal.plus();
		System.out.println(cal.value);
	}

}
