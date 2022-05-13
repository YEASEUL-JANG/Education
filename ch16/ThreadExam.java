package ch16;

public class ThreadExam extends Thread{//멀티스레드는 Thread를 상속받아야 함.
	//구현방법 1: thread를 상속
	//구현방법 2: Runnable을 구현
	public ThreadExam(String name) {
		super(name); //부모클래스의 생성자
	}
	@Override
	public void run() {
		for(int i=1; i<=5;i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000); //1초 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ThreadExam e1 = new ThreadExam("thread1");
		ThreadExam e2 = new ThreadExam("thread2");
		ThreadExam e3 = new ThreadExam("thread3");
		
		//e1.run()으로 호출하면 안됨. start()메소드를 반드시 써야한다.
		e1.start(); //스레드이름.start() -> run()이 자동 호출됨
		e2.start(); //위와 동시에 호출됨
		e3.start(); //위와 동시에 호출됨
	}

}
