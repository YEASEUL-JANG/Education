package ch08;

public class Calculator {
	private int left;
	private int right;
	
	//기본생성자
	public Calculator() {
		System.out.println("기본 생성자 호출...");
	}
	//한개라도 유저가 정의한 생성자가 만들어지면 컴파일러는 기본생성자를 만들지 않음.
	// -> 생성자를 만들땐 기본 생성자를 함께 만드는 습관을 들인다.
	public Calculator(int left, int right) {
		System.out.println("매개변수가 있는 생성자 호출...");
		this.left = left;
		this.right = right;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public void sum() {
		System.out.println(left+right);
	}
	public void avg() {
		System.out.println((left+right)/2);
	}
}
