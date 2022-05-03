package ch07;

public class BookStoreUse {

	public static void main(String[] args) {
		BookStore b1 = new BookStore();
		b1.setPerson("김선생");
		b1.setBookname("Java");
		b1.setBookstore("영진");
		b1.setBuy(10);
		b1.setMoney(30000);
		b1.setYear(2022);
		b1.print();
	}
}
