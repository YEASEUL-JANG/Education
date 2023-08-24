package ch12;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

//이벤트처리 : 사용자의 요청에 시스템이 응답하는 것.
/*이벤트 3대 요소
 * 1) 이벤트 소스 : 이벤트의 대상
 * 2) 이벤트 리스너 : 이벤트 관찰자, 감시자
 * 3) 이벤트 핸들러 : 이벤트 처리기
 */

public class InnerExam extends Frame{
	public InnerExam() { //기본생성자
		super("내부클래스 테스트"); //제목처리
		setSize(300, 400);//가로세로 초기사이즈 설정
		setVisible(true);//프레임을 화면에 표시
	}
	public static void main(String[] args) {
		InnerExam e=new InnerExam();
		e.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				
			}
			//윈도우창이 닫힐때 자동호출됨(x버튼 클릭 후)
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);//프로그램 강제종료
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				
			}
		});//무명클래스
	}
}
