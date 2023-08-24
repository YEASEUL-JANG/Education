package ch07;

public class Radio {
	double channel;
	int volume;
	boolean onoff;
	String brand;
	
	void getchannel(double a) {
		System.out.println("현재 채널은 "+ a + "입니다.");
	}
	void getvolume(int a) {
		System.out.println("볼륨은 "+ a + "입니다.");
	}
	void getbrand(String a) {
		System.out.println("["+ a + " 라디오]");
	}
	void getonoff(boolean a) {
		if(a == true) {
			System.out.println("라디오가 켜져있습니다.");
		}else {
			System.out.println("라디오가 꺼져있습니다.");
		}
	}
}
