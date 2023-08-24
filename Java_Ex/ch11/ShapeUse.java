package ch11;

public class ShapeUse {

	public static void main(String[] args) {
		// 추상클래스는 new 할수없음 ( Shape s = new Shape(); (X)	)
		Rectangle r = new Rectangle();
		r.move(100, 200);
		r.draw();
		
		Circle c = new Circle();
		c.move(5, 50);
		c.draw();
	}
}
