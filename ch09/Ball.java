package ch09;

public class Ball extends Circle{
	private String color;
	public Ball() {}
	public Ball(String color) {
		this.color = color;
	} //매개변수가 있는 생성자
	public void findColor() {
		System.out.println(color+"공이다.");
	}
	public void findVolume() {
		System.out.println("부피 구하기");
	}

}
