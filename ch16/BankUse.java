package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank mybank = new MyBank();
		BankPlayer b1 = new BankPlayer(1, mybank);
		BankPlayer b2 = new BankPlayer(2, mybank);
		BankPlayer b3 = new BankPlayer(3, mybank);
		
		b1.start();
		b2.start();
		b3.start();
		
	}

}
