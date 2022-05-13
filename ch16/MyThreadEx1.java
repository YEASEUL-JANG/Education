package ch16;

public class MyThreadEx1 extends Thread{
	public MyThreadEx1(String name) {
		super(name);
	}
	public MyThreadEx1() {
	}
    @Override
    public void run() {
    	for(int i=0;i<=10;i++) {
    		System.out.println(Thread.currentThread().getName());
    	}
    }
}
