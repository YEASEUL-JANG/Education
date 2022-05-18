package ch17;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;

import javax.swing.JApplet;

public class FontExam extends JApplet{
	private Font font;
	private FontMetrics fm; //글꼴관련 정보제공하는 클래스
	private int x,y;
	private String message;
	private Dimension dim;//특정 영역의 사각형과 폭과 높이값을 관리할 수 있도록도와주는 클래스
	@Override
	public void init() {
		message="그래픽 테스트";
		font=new Font("굴림",Font.ITALIC,30);
		fm=getFontMetrics(font);//폰트의 가로 세로 사이즈를 가져옴
		setSize(300,300);
		dim=getSize();//화면 크기를 계산해서 디멘션에 저장
		System.out.println(dim.width);//화면가로사이즈
		System.out.println(dim.height);//화면세로사이즈
		
		//문자열의 가로 세로를 계산해서 중앙에 놓기
		x= (dim.width/2)-(fm.stringWidth(message)/2); //폰트의 가로길이값
		y= (dim.height/2)-(fm.getDescent()/2); //폰트의 세로길이값
		
				
	}
@Override
public void paint(Graphics g) {
	
	super.paint(g);
	g.setFont(font);
	g.drawString(message, x, y);
}
}
