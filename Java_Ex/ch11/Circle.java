package ch11;

public class Circle extends Shape{

	@Override
	public void draw() {
		System.out.println("원그리기 시작 x 좌표값 : "+ x);
		System.out.println("원그리기 시작 y 좌표값 : "+ y);
	}

}
