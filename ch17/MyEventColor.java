package ch17;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyEventColor extends Frame{
	MyEventColor c;
	public MyEventColor() {
		Button b1 = new Button("red");
		Button b2 = new Button("green");
		Button b3 = new Button("blue");
		Button b4 = new Button("yellow");
		Button b5 = new Button("center");
		add(b1,"North");
		add(b2,"East");
		add(b3,"South");
		add(b4,"West");
		add(b5);
		
		b1.addActionListener(new MyColorAction2(this, Color.red,b5));
		b2.addActionListener(new MyColorAction2(this, Color.green,b5));
		b3.addActionListener(new MyColorAction2(this, Color.blue,b5));
		b4.addActionListener(new MyColorAction2(this, Color.yellow,b5));
	
	setSize(450,300);
	setVisible(true);
	
	addWindowListener(new WindowAdapter() {
		@Override
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	});
}//생성자 end
	
public static void main(String[] args) {
	new MyEventColor();
	
}
}
