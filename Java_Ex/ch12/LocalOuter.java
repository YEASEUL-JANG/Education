package ch12;
//지역내부클래스(메소드안에 생성되는 클래스)
//지역내부클래스는 반드시 해당 메소드안에서 객체생성을 해야한다.
public class LocalOuter {
	private int data=30;
	void display() {
		class LocalInner{
			void msg() {
				System.out.println(data);
			}
		}//inner
		
		LocalInner li = new LocalInner();
		li.msg();//메소드 안에서 이너클래스를 생성해야함.
	}//method
	
	public static void main(String[] args) {
		LocalOuter lo = new LocalOuter();
		lo.display(); //외부에서는 안의 내부클래스까지 못들어가고 메소드까지만 접근 가능하다.
	}
}
