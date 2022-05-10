package ch12;

interface RemoteControl{ //인터페이스
	void turnOn();
	void turnOff();
}
public class AnonymousClassTest {
public static void main(String[] args) {
	RemoteControl ac = new RemoteControl() {  //interface 는 객체생성을 못함.
		//무명클래스 처리하면 자동적으로 인터페이스를 무명클래스가 상속받아 오버라이딩 처리가능.
		@Override
		public void turnOn() {
			System.out.println("tv turnOn()");
		}
		@Override
		public void turnOff() {
			System.out.println("tv turnOff()");
		}
	};//무명내부클래스
	ac.turnOff();
	ac.turnOn();
}
}
