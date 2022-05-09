package ch11;

public class Car implements Vehicle {

	@Override
	public void speedUp() {
		// TODO Auto-generated method stub
		System.out.println("Car speedUp");
	}

	@Override
	public void speedDown() {
		// TODO Auto-generated method stub
		System.out.println("Car speeddown");
	}

	@Override
	public void handle() {
		// TODO Auto-generated method stub
		System.out.println("Car handling");
	}

}
