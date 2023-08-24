package ch16;

public class BankPlayer extends Thread{
	String name;
	MyBank my;
	int money;
	
	public BankPlayer() {
	}
	public BankPlayer(String name, int money,MyBank my) {
		this.my=my;
		this.money=money;
		this.name=name;
	}
	
	@Override
	public void run() {
		my.Bankstart(money, name);
	}//end run
}
