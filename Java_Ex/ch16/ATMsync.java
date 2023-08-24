package ch16;

public class ATMsync {
	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm,"mom");
		Thread son = new Thread(atm,"son");
		mom.start();
		son.start();
	}
}
class ATM implements Runnable {
	private long depositeMoney = 10000;
	
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<10;i++) {
				notify(); 
				try {
					wait();
					Thread.sleep(1000);
				} catch (Exception e) {
				}
				if(getDepositeMoney() <=0) {//잔액이 0원 이하면 
					break; //for 문을 빠져나감
				}
				withDraw(1000);
			}//end for
		}
	}//end run()

	private void withDraw(long howMuch) {
		if(getDepositeMoney() >0) {
			depositeMoney -= howMuch;
			System.out.print(Thread.currentThread().getName()+",");
			System.out.printf("잔액 : %,d 원 %n",depositeMoney);
		}else {
			System.out.println(Thread.currentThread().getName()+",");
			System.out.println("잔액이 부족합니다.");
		}
	}
	public long getDepositeMoney() {
		return depositeMoney;
	}
}
