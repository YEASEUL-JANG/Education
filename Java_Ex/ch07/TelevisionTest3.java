package ch07;

public class TelevisionTest3 {

	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.volume = 7;
		mytv.channel = 9;
		mytv.onOff = true;
		mytv.print();
		
		Television yourtv = new Television();
		yourtv.channel = 5;
		yourtv.volume = 12;
		yourtv.onOff = false;
		yourtv.print();
	}

}
