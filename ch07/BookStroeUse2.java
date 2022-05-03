package ch07;

public class BookStroeUse2 {

	public static void main(String[] args) {
		BookStore2 b1 = new BookStore2();
		b1.input("김선생", "Java", "영진", 2022, 30000, 10);
		b1.calc();
		b1.print();
	}
}
