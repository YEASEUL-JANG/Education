package ch16;

public class ThreadA {
public static void main(String[] args) {
	ThreadB b = new ThreadB();
	b.start();
	synchronized (b) {//ThreadB객체에 대해 동기화 블럭설정
		try {
			System.out.println("b가 완료될때까지 기다립니다.");
			b.wait();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Total is : "+ b.total);
	}
}
}
class ThreadB extends Thread{
	int total;
	@Override
	public void run() {
		synchronized (this) {
			for(int i=0;i<5;i++) {
				System.out.println(i+"를 더합니다.");
				total += i;
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}//for
			notify();
		}//synchronized
	}//run()
}
