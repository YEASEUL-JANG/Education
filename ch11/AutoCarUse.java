package ch11;

public class AutoCarUse {

	public static void main(String[] args) {
		OperateCar a = new AutoCar();
		a.setSpeed(90);
		a.start();
		a.stop();
		a.turn(80);
	}

}
