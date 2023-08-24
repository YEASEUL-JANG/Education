package ch07;

public class Television {
	//멤버 변수 = 초기화 안해도 됨. (지역변수는 초기화 해줘야 함)
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은 "+channel+"이고 볼륨은 "+"volume"+"입니다.");
	}
	int getChannel() {
		return channel;
	}
	void setChannel(int ch) {
		channel = ch; //로컬변수를 멤버변수에 저장.
	}

}
