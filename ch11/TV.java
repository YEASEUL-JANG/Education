package ch11;

public class TV implements RemoteControllable, Controllable {

	@Override
	public void turnOn() {
		System.out.println("tv를 켠다");
	}
	@Override
	public void turnOff() {
		System.out.println("tv를 끈다");
	}
	@Override
	public void remoteOn() {
		System.out.println("리모콘으로 TV를 켠다.");
	}
	@Override
	public void remoteOff() {
		System.out.println("리모콘으로 TV를 끈다.");
	}
	public static void main(String[] args) {
		TV t = new TV();
		t.turnOn();
		t.turnOff();
		t.remoteOff();
		t.remoteOn();
		
		Controllable.reset();
		
		Computer c = new Computer();
		c.turnOff();
		c.turnOn();
	}

}
