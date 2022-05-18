package ch17;
import java.awt.Color;
import java.awt.Graphics;

//JApplet은 Applet의 확장판으로 애플릿뷰어나 웹브라우저와 함께 쓰였으며 게임 및 다양한 그래픽을 구사할 수 있다.
//현재는 HTML5등 웹이 진화되면서 현재는 거의사용안함.
//라이프사이클을 가지고 있다. INIT() - START() - STOP() - DESTROY()
//INIT()은 필수처리하고 나머지는 옵션.
import javax.swing.JApplet;

public class StringLine extends JApplet{
	@Override
	public void init() {//애플릿을 초기화 시켜주는 메소드
		getContentPane().setBackground(new Color(255,255,255));
		setSize(300,300);//애플릿의 화면 사이즈
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.drawLine(250, 50, 30, 160);//선그리기(x1,y1,x2,y2)
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50);
		g.setColor(Color.green);
		g.drawString("Green string", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}
}
