package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class FrameColor extends JFrame{
	public FrameColor() throws InterruptedException{
		setVisible(true);
		
		Container c = getContentPane();//프레임에 컨텐츠를 추가하는 작업
		for(int i=0;i<=255;i++) {
			setSize(i*2,i);//프레임의 사이즈
			setLocation(i*2,i);//프레임의 좌표(x,y)
			c.setBackground(new Color(i, 0, 0));//배경색상 설정(r,g,b)
			Thread.sleep(10);//throws로 예외처리
		}
		for(int i=0;i<=255;i++) {
			setSize(i*2, i);
			setLocation(i*2,i);//프레임의 좌표(x,y)
			c.setBackground(new Color(255, i, 0));//배경색상 설정(r,g,b)
			Thread.sleep(10);//throws로 예외처리
		}
		//윈도우 닫기동작 옵션값
		setDefaultCloseOperation(EXIT_ON_CLOSE);//프로그램까지 종료
		//setDefaultCloseOperation(HIDE_ON_CLOSE); 숨김처리
		//setDefaultCloseOperation(DISPOSE_ON_CLOSE); 현재창만 닫음
	}//end FrameColor()
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();//생성자가 throws를 걸었기 때문에 메인메소드에도 throws로 예외처리
		
		
	}
}
