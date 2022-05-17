package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MyColorAction implements ActionListener{
	private JFrame f;
	private Color c;
	private Container con;
	
	// Component: 화면 구성요소(프레임, 버튼, 패널..)
	// Container: 다른 컴포넌트를 담을 수 있는 요소
	// ContentPane: 스윙에서는 여기에 컴포넌트를 부착시킬수 있는데, ContentPane은 JFrame객체가 처음생길때 자동생성됨.
	
	public MyColorAction(JFrame f, Color c) {
		this.f=f;
		this.c=c;
		con=f.getContentPane();//프레임에 컨텐츠영역
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상
		
		
	}

}
