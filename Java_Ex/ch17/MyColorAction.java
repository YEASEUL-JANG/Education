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
	
	public MyColorAction(JFrame f, Color c) {
		this.f=f;
		this.c=c;
		con=f.getContentPane();//다음 컨텐츠 영역을 불러와라
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);//배경색상
	}
}
