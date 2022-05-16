package ch16;

public class RunnableExam implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println((Thread.currentThread().getName())+"==>"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
public static void main(String[] args) {
	
	RunnableExam e1 = new RunnableExam();
	
	//Runnable을 쓸때는 Thread를 별도로 생성해서 써야한다.
	//new Thread(스레드구현객체, "스레드이름")
	Thread t1 = new Thread(e1,"thread1");
	Thread t2 = new Thread(e1,"thread2");
	
	t1.start();
	t2.start();
}
}