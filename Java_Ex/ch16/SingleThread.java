package ch16;

public class SingleThread {//작업단위가 1개(mainThread)

		void print() {
			//현재 실행중인 스레드의 이름
			System.out.println(Thread.currentThread().getName());
			for(int i=1;i<=5;i++) {
				System.out.println(i);
			}
		}
	public static void main(String[] args) {
		SingleThread t = new SingleThread();
		t.print();
		t.print();
	}

}
