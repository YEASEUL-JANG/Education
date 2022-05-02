package ch07;

public class RadioTest {

	public static void main(String[] args) {
		Radio my = new Radio();
		my.getbrand("브리츠");
		my.getonoff(true);
		my.getchannel(89.1);
		my.getvolume(12);
		
		System.out.println();
		
		Radio your = new Radio();
		your.getbrand("아이리버");
		your.getonoff(false);
		your.getchannel(95.1);
		your.getvolume(9);
	}

}
