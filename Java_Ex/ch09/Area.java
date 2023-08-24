package ch09;

public class Area {

	private int width; //int는 기본으로 0 초기화됨(전역변수)
	private int length;
	
	public Area() { // 기본생성자 (컨트롤+스페이스바)
	}

	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	public int getArea() {
		return width*length;
	}
	
}
