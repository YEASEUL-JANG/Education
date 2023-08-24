package ch16;

public class BankUse {
	public static void main(String[] args) {
		MyBank mybank = new MyBank();
		BankPlayer b1 = new BankPlayer("홍길동",10,mybank);
		BankPlayer b2 = new BankPlayer("사임당",20,mybank);
		BankPlayer b3 = new BankPlayer("이몽룡",30,mybank);
		
		b1.start();
		b2.start();
		b3.start();
		
	}

}
