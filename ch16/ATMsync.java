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
				notify(); //wait하고 있는 스레드(한개만)에 notify신호를 보냄
				//여러스레드에서 wait을 하고 있어도 그 중 한개만 깨우게됨.
				//wait상태의 스레드가 없는경우 notify신호는 그냥 소멸한다.
				//notifyAll() : wait을 하고 있는 모든 스레드를 깨움. 이 때 깨어나는 순서는 어떤게 먼저 깰지 모른다.
				//어떤게 먼저 깰지 모른다.
				try {
					wait(); //현재 실행 스레드를 일시정지상태로 만들면서 다른 스레드가 실행되도록 허용
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
