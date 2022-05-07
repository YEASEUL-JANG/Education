package ch10;

public class Product {
	int price;
	String name;
	public Product(int price, String name) {
		this.price = price;
		this.name = name;
		
	}
}

class Tv extends Product{
	public Tv() {
		super(100,"Tv");
	}

	@Override
	public String toString() {
		return "Tv";
	}
	
}
class Computer extends Product{
	public Computer() {
		super(200,"Computer");
	}
	@Override
	public String toString() {
		return "Computer";
	}
}
class Audio extends Product{
	public Audio() {
		super(10,"Audio");
	}
	@Override
	public String toString() {
		return "Audio";
	}
}
class buyer {
	int money = 1000;
	Product cart[] = new Product[5];
	int i = 0;
	
	void buy(Product p){
		money -= p.price;
		cart[i++]=p;
		System.out.println(p+"를 구입하셨습니다.");
	}
	void summary(){
		int sum = 0;
		String itemList="";
		
		for(int i=0; i<cart.length; i++) {
			if(cart[i]==null) break;
			sum += cart[i].price;
			itemList += cart[i]+",";
		}
		System.out.println("구입하신 물품의 총금액은 "+sum+"만원이고");
		System.out.println("구입하신 제품은 "+itemList+ "입니다.");
	}
}


