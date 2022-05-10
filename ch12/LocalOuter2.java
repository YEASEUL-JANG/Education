package ch12;

public class LocalOuter2 {
	private int data=20;
	void display() {
		
		int value=50;//지역변수를 inner class아래 위치시키면 에러(jdk1.7이후가능)
		class LocalInner2{
			void msg() {
				System.out.println(value);
			}
		}//inner
		
		LocalInner2 in=new LocalInner2();
		in.msg();
	}//method
public static void main(String[] args) {
	LocalOuter2 iin = new LocalOuter2();
	iin.display();
}
}
