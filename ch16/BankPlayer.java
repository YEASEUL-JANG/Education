package ch16;

public class BankPlayer extends Thread{
	int type;
	MyBank my;
	
	public BankPlayer() {
	}
	public BankPlayer(int type, MyBank my) {
		this.my=my;
		this.type=type;
	}
	BankPlayer b;
	@Override
	public void run() {
		switch (type) {
		case 1:
			my.Bankstart1();
			break;
		case 2:
			my.Bankstart2();
			break;
		case 3:
			my.Bankstart3();
			break;

		}
	}//end run
}
