package ch11;

public class Airplane implements Flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Airplane 비행");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Airplane 착륙");

	}

}
