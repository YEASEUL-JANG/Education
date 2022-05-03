package ch07;

public class BookStore2 {
	private String person;
	private String bookname;
	private String bookstore;
	private int year;
	private int money;
	private int buy;
	private int buy_money;
	
	public void input(String person, String bookname, String bookstore, int year, int money, int buy) {
		this.person = person;
		this.bookname=bookname;
		this.bookstore=bookstore;
		this.year=year;
		this.money=money;
		this.buy=buy;
	}
	public void calc() {
		this.buy_money = buy*money;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+person+"\t"+bookstore+"\t"+year+"\t"+money+"\t"+buy+"\t"+buy_money);
	}

}
