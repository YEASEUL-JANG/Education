package ch14;

public class Product {
	private String name;
	private String maker;
	private String date;
	private int money;
	private int num;
	private int total;
	
	public Product() {}
	
	public Product(String name, String maker, String date, int money, int num, int total) {
		super();
		this.name = name;
		this.maker = maker;
		this.date = date;
		this.money = money;
		this.num = num;
		this.total = total;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
