package ch07;

public class BoxTest {

	public static void main(String[] args) {
		//우리가 만든 클래스는 (객체형)데이터 타입이 될 수 있다.
		Box b;
		b=new Box();
		b.height = 10;
		b.length = 20;
		b.width = 20;
		System.out.println("상자의 가로, 세로, 높이는 "+b.width+","+b.length+","+b.height);
	}

}
