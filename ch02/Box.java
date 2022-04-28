package ch02;

public class Box {
	//사각형의 넓이, 둘레를 구하는 프로그램
	//가로길이 = 10.0, 세로=5.0
	//넓이 : 가로 x 세로
	public static void main(String[] args) {
		double width;
		double hight;
		double area;
		double perimeter;
		
		width = 10.0;
		hight = 5.0;
		area = width * hight;
		perimeter = 2.0*(width+hight);
		
		System.out.println("사각형의 넓이는 "+area);
		System.out.println("둘레의 길이는 "+perimeter);
		
		
	}

}
