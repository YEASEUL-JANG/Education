package ch16;

public class ThreadJoin extends Thread{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작됨.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료됨.");
	}//run()
	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작됨.");
		
		ThreadJoin e = new ThreadJoin();
		e.setName("thread1");//스레드 이름 셋팅
		e.start();
		try {
			e.join(); 
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료됨.");
	}//main
}
