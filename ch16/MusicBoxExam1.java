package ch16;

public class MusicBoxExam1 {

	public static void main(String[] args) {
		MusicBox box = new MusicBox();
		MusicPlayer kim = new MusicPlayer(1,box);
		MusicPlayer lee = new MusicPlayer(2,box);
		MusicPlayer jan = new MusicPlayer(3,box);
		
		//실행
		kim.start();
		lee.start();
		jan.start();
	}

}
