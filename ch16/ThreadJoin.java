package ch16;

public class ThreadJoin extends Thread{
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작됨.");
		
		ThreadJoin e = new ThreadJoin();
		e.setName("thread1");//스레드 이름 셋팅
		e.start();
		try {
			e.join(); //새로운 작업을 요청하면 기다렸다가 다시실행 - 잠시 멈췄다가 다른작업이 끝나면 다시 실행함.
		} catch (Exception e2) {
			e2.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료됨.");
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+"스레드가 시작됨.");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName()+"스레드가 종료됨.");
	}
}
