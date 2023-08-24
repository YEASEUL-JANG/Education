package ch09;

class Animal{
	
	public Animal(String s) { //매개변수 1개 생성자
		System.out.println("동물 : "+ s);
	}
}
class Mammal extends Animal{
	public Mammal() {
		//super()를 쓸때에도 반드시 첫째줄에 써야한다. (=this()처럼)
		super("원숭이"); // 부모클래스 생성자 호출하여 초기화설정해야 함.(상속받았으므로)
		System.out.println("포유류 : 원숭이");
	}
	public Mammal(String s) {
		super(s);// 부모클래스 생성자 호출
		System.out.println("포유류 : "+ s);
		
	}
	
}
public class AnimalDemo {
	public static void main(String[] args) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");
		
	}
}
