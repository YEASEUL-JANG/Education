package ch10;

class FireEngine extends Car{
	int b = 20;
	void water() {
		System.out.println("water");
	}
}
class Ambulance extends Car{
	void siren() {
		System.out.println("siren~~");
	}
}
public class Car {
	String color;
	int door;
	void drive() {
		System.out.println("drive");
	}
	void stop() {
		System.out.println("stop!");
	}
	public static void main(String[] args) {
		Car c = new FireEngine(); // 자손의 객체를 조상타입의 리모컨으로 형변환 (조상의 기능만 사용가능)
		System.out.println("c instanceof FireEngine? :"+(c instanceof FireEngine));
		//System.out.println(c.b);
		//c.water();               에러 : 조상의 리모컨으로는 자손의 객체를 다룰수없다.(변수, 메서드 둘다 X)
		c.drive(); // 조상의 메서드이므로 사용가능.
		//Ambulance a = (Ambulance)new Car();  자손타입 참조변수는 조상의 객체를 가리킬 수 없다. 
	}

}
