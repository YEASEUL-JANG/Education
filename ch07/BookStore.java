package ch07;

public class BookStore {
	private String person;
	private String bookname;
	private String bookstore;
	private int year;
	private int money;
	private int buy;
	private int buy_money;
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public String getBookstore() {
		return bookstore;
	}
	public void setBookstore(String bookstore) {
		this.bookstore = bookstore;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getBuy() {
		return buy;
	}
	public void setBuy(int buy) {
		this.buy = buy;
	}
	public int getBuy_money() {
		buy_money = buy*money;
		return buy_money;
	}
	public void setBuy_money(int buy_money) {
		this.buy_money = buy_money;
	}
	
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격\t판매수량\t판매금액");
		System.out.println(bookname+"\t"+person+"\t"+bookstore+"\t"+year+"\t"+money+"\t"+buy+"\t"+getBuy_money());
	}
	
}
