package ch10;
class Triangle extends Figure{
	void draw() {
	System.out.println("삼각형그리기...");
	}
}
class Rectangle extends Figure{
	void draw() {
System.out.println("사각형그리기...");	
}
}
class Circle extends Figure{
	void draw() {
System.out.println("원 그리기...");	
}
}
public class Figure {
	void draw2() {
		System.out.println("도형을 그려봅시다.");
	}
	public static void main(String[] args) {
		
		// 다형성 (부모의 참조변수로 자식의 멤버들 사용가능)
//		Figure f = new Triangle();
//		f.draw();
//		f = new Rectangle();
//		f.draw();
//		f=new Circle();
//		f.draw();
		
		Figure f = null;
		Triangle t = new Triangle();
		t.draw2();
		t.draw();
		
		t=(Triangle)f;
		t.draw();
		t.draw2();
		
	}
}
