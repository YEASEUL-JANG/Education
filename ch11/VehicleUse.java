package ch11;

public class VehicleUse {

	public static void main(String[] args) {
		
		Vehicle v = new Car();
		v.speedDown();
		v.speedUp();
		v.handle();
		
		v = new Boat();
		v.speedDown();
		v.speedUp();
		v.handle();
		
		v= new Plane();
		v.speedDown();
		v.speedUp();
		v.handle();
		
	}

}
