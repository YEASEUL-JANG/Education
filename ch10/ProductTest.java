package ch10;

public class ProductTest {

	public static void main(String[] args) {
		buyer b = new buyer();
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Tv());
		b.summary();
	}
}
