package ch16;

public class Priority extends Thread {
	public static void main(String[] args) {
		Priority e1 = new Priority();
		Priority e2 = new Priority();
		//스레드의 이름
		e1.setName("스레드1");
		e2.setName("스레드2");
		System.out.println("e1의 기본 우선순위 : "+e1.getPriority());
		System.out.println("e2의 기본 우선순위 : "+e2.getPriority());
		//스레드의 우선순위 설정(1~10)
		//Thread.MAX_PRIORITY 최대우선순위(10순위)
		//Thread.NORMAL_PRIORITY 최대우선순위(5순위)
		//Thread.MIN_PRIORITY 최소우선순위(1순위)
		e1.setPriority(Thread.MAX_PRIORITY);//(10)
		e2.setPriority(Thread.MIN_PRIORITY);//(1)
		
		e1.start();
		e2.start();
		
	}
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			System.out.println(Thread.currentThread().getName()+"==>"+i);
		}
	}
}
