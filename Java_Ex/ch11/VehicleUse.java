package ch11;

public class VehicleUse {

	public static void main(String[] args) {
		
		Vehicle v = new Car(); //car - 인터페이스인 Vehicle을 상속한 클래스
		v.speedDown();
		v.speedUp();
		v.handle();
		
		v = new Boat(); //Boat - 인터페이스인 Vehicle을 상속한 클래스
		v.speedDown();
		v.speedUp();
		v.handle();
		
		v= new Plane(); //Plane - 인터페이스인 Vehicle을 상속한 클래스
		v.speedDown();
		v.speedUp();
		v.handle();
		
	}

}
