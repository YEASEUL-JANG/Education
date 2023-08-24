package ch07;

public class TelevisionTest4 {

	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.volume = 12;
		mytv.channel = 30;
		mytv.onOff = true;
		int ch = mytv.getChannel();
		System.out.println("현재 채널은 "+ch+"이고 볼륨은 "+mytv.volume+"이고 전원은 "+mytv.onOff+"이다.");
	}

}
