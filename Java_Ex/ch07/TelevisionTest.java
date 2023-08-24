package ch07;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv = new Television();
		tv.channel = 7;
		tv.volume = 9;
		tv.onOff = true;
		System.out.println("TV의 채널은 "+ tv.channel);
		System.out.println("TV의 볼륨은 "+ tv.volume);
	}

}
