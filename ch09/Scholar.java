package ch09;

public class Scholar extends Student {
	private String category; 
	private int money;

	// 생성자 이용
	public Scholar(String name, String num, String major, int year, String category, int money) {
	super(name, num, major, year);
	this.category = category;
	this.money = money;
	}
	
	
	// input 메소드 이용
//	public void input(String name, String num, String major, int year, String category, int money) {
//		super.input(name, num, major, year);
//		this.category = category;
//		this.money = money;
	// super() => 부모클래스의 생성자 호출에 사용
	// super. => 부모클래스의 메소드,변수 호출에 사용
	// this()=> 현재 클래스의 생성자 호출에 사용
	// this. => 현재 클래스의 변수, 메소드 호출
//	}
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear()+"\t"+category+"\t"+money);
	}
	public void print2() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(getName()+"\t"+getNum()+"\t"+getMajor()+"\t"+getYear());
	}
}
