package ch11;

public class AutoCar implements OperateCar {

	@Override
	public void start() {
		System.out.println("자동차 출발");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}

	@Override
	public void setSpeed(int speed) {
		System.out.println("자동차가 속도를 "+speed+"만큼 바꿉니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turn(int speed) {
		System.out.println("자동차가 방향을 "+speed+"만큼 바꿉니다.");
	}

}
