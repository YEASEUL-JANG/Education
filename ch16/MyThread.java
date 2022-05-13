package ch16;

public class MyThread extends Thread{
public MyThread(String name) {
super(name);
}
public MyThread() {
	// TODO Auto-generated constructor stub
}

public void run() {
	for(int i=1; i<=5; i++) {
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("run메소드 실행");
		}
	}
}
}
