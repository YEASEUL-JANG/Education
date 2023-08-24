package ch07;

public class TelevisionTest5 {

	public static void main(String[] args) {
		Television mytv = new Television();
		mytv.setChannel(11); //setter 를 통해 값을 초기화(저장)
		int ch = mytv.getChannel(); //getter를 통해 값을 불러옴
		System.out.println("현재 채널은 " +ch+"입니다.");
		
	}

}
