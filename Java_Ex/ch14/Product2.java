package ch14;

import java.util.Scanner;

public class Product2 {
	private String product_num;
	private String name;
	private String maker;
	private String date;
	private int money;
	private int num;
	private int val;//부가세
	private int total;
	private int total_money;
	
	public void input() {
	Scanner scan = new Scanner(System.in);
	System.out.println("제품번호: ");
	product_num = scan.next();
	System.out.println("제품명: ");
	name = scan.next();
	System.out.println("제조사: ");
	maker = scan.next();
	System.out.println("제조일자: ");
	date = scan.next();
	System.out.println("단가 :");
	money = scan.nextInt();
	System.out.println("수량 :");
	num = scan.nextInt();
	 
	total=money*num;
	val = (int)(total*0.1);
	total_money=total+val;
	}
	
	Product2(){}
	
	public String getProduct_num() {
		return product_num;
	}
	public void setProduct_num(String product_num) {
		this.product_num = product_num;
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
	public int getVal() {
		return val;
	}
	public void setVal(int val) {
		this.val = val;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public int getTotal_money() {
		return total_money;
	}
	public void setTotal_money(int total_money) {
		this.total_money = total_money;
	}
	
	
}
