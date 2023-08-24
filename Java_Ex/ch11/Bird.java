package ch11;

public class Bird implements Flyer {

	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		System.out.println("Bird 이륙");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Bird 비행");

	}

	@Override
	public void land() {
		// TODO Auto-generated method stub
		System.out.println("Bird 착륙");

	}

}
