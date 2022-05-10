package ch12;

public class OuterClass {
	private static int x =10;
	class Inner{
		int getX() {
			return x;
		}
	}
	public static void main(String[] args) {
		System.out.println(x); // x 는 스태틱멤버니까 바로 사용가능하다.
		OuterClass ou = new OuterClass();
		OuterClass.Inner in = ou.new Inner();
		System.out.println(in.getX());
		
		
	}
}
