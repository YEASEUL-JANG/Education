package ch11;

public class FlyerUse {

	public static void main(String[] args) {
		Bird b = new Bird();
		b.takeOff();
		b.fly();
		b.land();
		
		Airplane a = new Airplane();
		a.takeOff();
		a.fly();
		a.land();
		
		//다형성기법 (인터페이스를 부모화함)
		Flyer f = new Bird();
		f.land();
		f.takeOff(); //F3을 눌러보면 해당되는 부모 Flyer의 메소드 확인가능
		f.fly();
		
		f= new Airplane();
		f.land();
		f.fly();
		f.takeOff();
	}

}
