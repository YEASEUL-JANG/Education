package ch14;

public class Type3<T> {//자료형이 미정인 상태(대신 여러가지를 쓰고싶음)
	T t; // 변수도 자료형이 미정임
	

	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	
	
	public static void main(String[] args) {
		Type3<String> t = new Type3<String>(); //인스턴스를 생성할 때 자료형을 정해줌 => 제너릭(일반화)
		t.setT("100");
		System.out.println(t.getT());
		
		Type3<Integer> t2 = new Type3<Integer>(); //인스턴스를 생성할 때 자료형을 정해줌 => 제너릭(일반화)
		t2.setT(100);
		System.out.println(t.getT());
		
		Type3 t3 = new Type3(); //<>자료형을 주지않고 일반적방법으로 new했을땐 실행은 되지만 경고표시뜸 => 내부적으로 다 object화 함(메모리낭비)
	}

}
