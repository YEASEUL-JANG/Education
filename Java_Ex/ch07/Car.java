package ch07;

public class Car {
	String color;
	int speed;
	int gear;
	@Override
	public String toString() {
		return "Car [color=" + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	void changeGear(int g) {
		gear = g;
		System.out.println("차량 기어단수 : " +gear+"단");
		
	}
	void speedUp() {
		speed = speed+10;
		
	}
	void speedDown() {
		speed = speed -10;
	}
	void getcolor(String a) {
		color = a;
		System.out.println("차량 색상 : " +color);
		
	}
	void getspeed(int a) {
		speed = a;
		System.out.println("차량 속도 : " +speed+"km/h");
		
	}
}
