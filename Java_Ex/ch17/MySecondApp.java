package ch17;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JPanel;

public class MySecondApp extends JApplet implements MouseListener, MouseMotionListener {
	private int x,y;
	private int width, height;
	private Image img;
	public boolean flag= false; 
	Component c = getContentPane();
	
	@Override
	public void init() {
		setSize(500,500);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("달이.jpg"));
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		setFocusable(true);
		requestFocus();
		c.setBackground(Color.green);
		
	}
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로, 세로길이 계산
		width=img.getWidth(null);//초기화
		height = img.getHeight(null);
		System.out.println(width+","+ height);
		
		if(flag) {
			g.drawImage(img, x, y, this);
			c.setBackground(Color.green);
		
		}
		
		g.setColor(Color.blue);
		g.drawString("귀염댕 달이를 보고싶으면 클릭하세요!", 10, 50);
		Graphics2D g2 = (Graphics2D) g;
		g2.setStroke(new BasicStroke(3));//선굵기 조절
		g.setColor(Color.yellow);
		g.drawLine(10,58,210,58);
		
	
	
	}//end paint
	
	

	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		System.out.println("mouth move : x:"+x+" ,y"+y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		flag = true;
		x=e.getX();
		y=e.getY();
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}
	
}
