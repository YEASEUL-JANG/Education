package ch12;
//정적중첩클래스(static 내부클래스)
public class StaticOuter {
	static int data = 30;
	int data2 = 50;
	static class StaticInner{
		void msg() {
			System.out.println("data : "+data);
			//System.out.println("data2 : "+data2); static클래스는 static멤버만 허용
		}
	}
	public static void main(String[] args) {
		StaticOuter.StaticInner in= new StaticOuter.StaticInner();
		//static 내부클래스는 생성치 참조변수 = new 외부클래스.내부클래스생성자
		in.msg();
	}
}
