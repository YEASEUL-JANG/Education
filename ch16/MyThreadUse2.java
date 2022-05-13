package ch16;

public class MyThreadUse2 {

	public static void main(String[] args) {
		MyThreadEx2 e1 = new MyThreadEx2("스레드1**");
		MyThreadEx2 e2 = new MyThreadEx2("스레드2++");
		MyThreadEx2 e3 = new MyThreadEx2("스레드3##");
		
		Thread p1 = new Thread(e1);
		Thread p2 = new Thread(e2);
		Thread p3 = new Thread(e3);
		
		p1.start();
		p2.start();
		p3.start();
		
		p1.setPriority(Thread.MAX_PRIORITY);
		p3.setPriority(Thread.MIN_PRIORITY);
	}

}
