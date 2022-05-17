package ch16;

public class MyBank {
	
	public MyBank() {
	}
	public synchronized void Bankstart(int money1, String name) {
		for(int i=1;i<=5;i++) {
			System.out.println(name+"님의 통장잔고는 "+money1+"만원 입니다.");
			money1 += 10;
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
		System.out.println();
	}//method1
	}
