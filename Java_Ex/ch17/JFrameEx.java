package ch17;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class JFrameEx extends JFrame{
	public JFrameEx() {//닫기기능이 기본으로 처리되어있음.
	//super("JFrame예제");//제목처리
		Container c = getContentPane();
		c.setBackground(Color.orange);
	setTitle("JFrame예제");
	
	setSize(300,200);
	setVisible(true);
		
		
	}
	public static void main(String[] args) {
		new JFrameEx();
	}
}
