package ch16;

public class MyBank {
	public synchronized void Bankstart1() {
		int money1 = 10;
		for(int i=1;i<=5;i++) {
			System.out.println("홍길동님의 통장잔고는 "+money1+"만원 입니다.");
			money1 += 10;
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
		System.out.println();
	}//method1
	public synchronized void Bankstart2() {
		int money2 = 20;
		for(int i=1;i<=5;i++) {
			System.out.println("사임당님의 통장잔고는 "+money2+"만원 입니다.");
			money2 += 10;
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
		System.out.println();
		notify();
	}//method2
	public synchronized void Bankstart3() {
		int money3 = 30;
		try {
			wait();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		for(int i=1;i<=5;i++) {
			System.out.println("이몽룡님의 통장잔고는 "+money3+"만원 입니다.");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
			money3 += 10;
		}//for
		System.out.println();
	}//method3
}
