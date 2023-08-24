package ch17;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class FrameExam {
public static void main(String[] args) {
	Frame f = new Frame("프레임 제목");//윈도우 창과 같은 화면을 띄우는 클래스
	f.setSize(200,300);//가로 200 세로 300 프레임의 사이즈 설정
	f.setVisible(true);//프레임을 화면에 표시함
	
//	화면닫기기능
//	f.addWindowListener(new WindowListener() {//익명내부클래스
//		
//		@Override
//		public void windowOpened(WindowEvent e) {
//		}
//		
//		@Override
//		public void windowIconified(WindowEvent e) {
//		}
//		
//		@Override
//		public void windowDeiconified(WindowEvent e) {
//		}
//		
//		@Override
//		public void windowDeactivated(WindowEvent e) {
//		}
//		
//		@Override
//		public void windowClosing(WindowEvent e) {
//			System.exit(0);//프로그램을 종료시킴
//			//정상종료 : 0, 비정상종료 : -1
//		}
//		
//		@Override
//		public void windowClosed(WindowEvent e) {
//		}
//		
//		@Override
//		public void windowActivated(WindowEvent e) {
//		}
//	});
	// 어댑터를 쓰면 코드가 간략해짐.
	f.addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}
}
