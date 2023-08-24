package ch11;

public interface Controllable {
	 default void repair() { //인터페이스에서 구현부 메소드를 만드려면 앞에 default를 씀, 단 jdk8부터
		System.out.println("장비를 수리한다."); 
	 }
	 static void reset() { //static메소드도 구현가능, 단 jdk8부터
		 System.out.println("장비를 초기화한다.");
	 }
	 // 참고 : private메소드로의 구현은 jdk9부터 가능
	 // 실무에서는 아직 인터페이스에서 위와같은 구현메소드를 사용하지 않음
	 
	 void turnOn();
	 void turnOff();
}
