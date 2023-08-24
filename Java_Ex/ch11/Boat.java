package ch11;

public class Boat implements Vehicle {

	@Override
	public void speedUp() {
		System.out.println("Boat speedUp");
	}

	@Override
	public void speedDown() {
		System.out.println("Boat speedDown");

	}

	@Override
	public void handle() {
		System.out.println("Boat handling");

	}

}
