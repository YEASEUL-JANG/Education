package ch08;

public class Book {
	private String bookName;
	private String author;
	private String press;
	private int year;
	private int price;
	private int amount;
	private int money;
	// 기본생성자 => 우클릭 -> source -> Generate Construtors from Superclass
	public Book() {
		this("자바","김선생","한빛",2020,20000,10);
		System.out.println("기본생성자 호출");
	}
	// 매개변수 생성자 => 우클릭 -> source -> Generate Construtors using Fields
	public Book(String bookName, String author, String press, int year, int price, int amount) {
		System.out.println("매개변수가 있는 생성자 호출");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookName+"\t"+author+"\t"+press+"\t"+year+"\t"+price+"\t"+amount+"\t"+money);
	}

		public static void main(String[] args) {
			Book b = new Book("java","홍길동","영진",2017,35000,5);
			b.print();
			System.out.println();
			
			Book b2 = new Book();
			b2.print();
		}
}
