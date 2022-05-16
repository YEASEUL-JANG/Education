package ch16;
/* 
 * synchronized : 
 * 모니터링 락을 걸음(동기화) : 해당 메소드가 완전히 끝난 후 다른 메소드가 실행될 수 있다.
 */
public class MusicBox {
	public void playMusicA() {
		for(int i=0;i<10;i++) {
			synchronized(this) {//this: musicBox 객체 자신
			System.out.println("신나는 음악!!!");
			}//synchronized 메소드 안에 처리
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}
	public synchronized void playMusicB() {
		for(int i=0;i<10;i++) {
			System.out.println("슬픈 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}
	public synchronized void playMusicC() {
		for(int i=0;i<10;i++) {
			System.out.println("카페 음악!!!");
			try {
				Thread.sleep((int)(Math.random()*1000));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}//for
	}
}
