package ch16;

public class MyThreadEx1 extends Thread{
	public MyThreadEx1(String name) {// 스레드의 매개변수 생성자
		super(name);
	}
	public MyThreadEx1() {
	}
    @Override
    public void run() {//run()메소드 필수 생성되어야함
    	for(int i=0;i<=10;i++) {
    		System.out.println(Thread.currentThread().getName());
    	}
    }
}
