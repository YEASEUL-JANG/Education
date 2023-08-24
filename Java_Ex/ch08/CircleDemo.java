package ch08;

class Circle{
	private double radius;
	private String color;
	
	public Circle (double r, String c) {
		radius = r;
		color = c;
	}
	public Circle (double r) {
		radius = r;
		color = "파랑";
	}
	public Circle (String c) {
		radius = 10.0;
		color = c;
	}
	public Circle() {
		radius = 10.0;
		color = "파랑";
	}
	public void print() {
		System.out.println("반지름 : "+radius);
		System.out.println("색 : "+color);
	}
}

public class CircleDemo {

	public static void main(String[] args) {
		Circle c = new Circle("빨강");
		c.print();
	}

}
