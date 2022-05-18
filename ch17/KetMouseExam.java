package ch17;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;
/*
 * MouseListener : 마우스 이벤트처리
 * MouseMotionListener : 마우스 이동 이벤트처리
 * KeyListener : 키보드 감지 이벤트처리
 */

public class KetMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener{
	private int x,y;//이미지 출력할 x,y 좌표값
	private int width, height;
	private Image img;//이미지 car.git 사용할 변수
	private boolean flag= false; //이미지가 처음 실행할땐 안보이게.. 불린값을 처음에 false로 초기화함.
	@Override
	public void init() {
		setSize(300,300);
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("car.gif"));
		//현재 클래스에 마우스이벤트기능을 추가
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		this.addKeyListener(this);
		setFocusable(true);//키를입력받을 수 있도록 설정
		requestFocus();//현재 화면에 키 입력을 요청
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		//이미지의 가로, 세로길이 계산
		width=img.getWidth(null);//초기화
		height = img.getHeight(null);
		System.out.println(width+","+ height);
		
		if(flag) {//마우스 클릭시 true로 바뀜
			g.drawImage(img, x, y, this);
			//drawImage(img, x,y, 이미지 관찰자);
		}
	}//end paint
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		//키를 입력하면 호출
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//키가 눌려져 있을 때
		System.out.println(e.getKeyCode());//키 코드값
		System.out.println(e.getKeyChar());//키 문자값
		switch (e.getKeyCode()) {
		case KeyEvent.VK_UP://위쪽 화살표키
			y=Math.max(0, y-5); break;
		case KeyEvent.VK_DOWN://아래쪽 화살표키
			y=Math.min(300-height, y+5); break;
		case KeyEvent.VK_LEFT://아래쪽 화살표키
			x=Math.max(0, x-5); break;
		case KeyEvent.VK_RIGHT://아래쪽 화살표키
			x=Math.min(300-width, x+5); break;
		}
		repaint();//그래픽 갱신
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//키가 눌려지고
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouth drag : x:"+x+" ,y"+y);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		//마우스커서가 컴포넌트상에서 이동했지만 버튼은 작동하지 않은 상태
		x=e.getX();
		y=e.getY();
		System.out.println("mouth move : x:"+x+" ,y"+y);
		repaint();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		//컴포넌트상에서 마우스 버튼을 클릭(눌렀다가 완전히 뗀상황)시 호출
		flag = true;//클릭하면 그림을 true로 설정하여 보여지게 함.
		//마우스 클릭한 좌표저장
		x=e.getX();
		y=e.getY();
		repaint();//그래픽 갱신요청 -> paint()자동호출
	}

	@Override
	public void mousePressed(MouseEvent e) {
		//마우스버튼을 누를때 호출
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//컴포넌트상에서 마우스버튼을 때어 놓아질때 호출
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//마우스가 컴포넌트 안에 들어갈때
	}

	@Override
	public void mouseExited(MouseEvent e) {
		//마우스가 컴퍼넌트에서 빠져나올때 호출
	}
	
}
