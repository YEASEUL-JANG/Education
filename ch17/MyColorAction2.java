package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyColorAction2 implements ActionListener{
	
	private Frame f;
	private Color c;
	private Button b;
	
	
	public MyColorAction2(Frame f, Color c, Button b) {
		this.f=f;
		this.c=c;
		this.b=b;
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		b.setBackground(c);
	}

}
