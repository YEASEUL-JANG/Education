package ch14;

public class Box {
	//멤버변수
	private Object data;
	//지역변수
	public void set(Object data) {
		this.data = data;
		
	}
	public Object get() {//리턴타입이 Object
		return data;
		
	}
	public static void main(String[] args) {
		Box b = new Box();
		b.set("Hello World");//문자열 처리 가능~ 모든 타입 가능
		String s = (String)b.get();//string 타입에 object타입을 넣을 수 없음.
		
		Box c = new Box();
		c.set(30);
		Integer i = (Integer)c.get(); // 클래스객체=object객체(조상)
		
		System.out.println(s);
		System.out.println(i);
	}
}
