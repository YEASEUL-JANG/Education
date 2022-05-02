package ch07;

public class TelevisionTest2 {

	public static void main(String[] args) {
		Television mytv = new Television();
		System.out.println(mytv);
		mytv.channel = 9;
		mytv.volume = 20;
		mytv.onOff = true;
		System.out.println("나의 TV 채널은" + mytv.channel+"이고 볼륨은 " +mytv.volume+"이다");
		
		Television yourtv = new Television();
		System.out.println(yourtv);
		yourtv.channel = 5;
		yourtv.volume = 15;
		yourtv.onOff = false;
		System.out.println("너의 TV 채널은" + yourtv.channel+"이고 볼륨은 " +yourtv.volume+"이다");
	}

}
