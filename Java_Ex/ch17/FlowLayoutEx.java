package ch17;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutEx extends JFrame{ //플로우 레이아웃 : 윈도우 창에 따라 버튼위치가 유동적으로 변함.
	JPanel jp;//패널 선언
	JButton jb[] = new JButton[6];
	
	public FlowLayoutEx() {
		super("FlowLayout 예제");//Jframe은 조상 생성자에 제목처리가능
		jp= new JPanel();//패널생성
		
		for(int i=0;i<=5;i++) {
			jb[i]=new JButton("버튼"+(i+1));//버튼6개 생성
			jp.add(jb[i]);//패널에 버튼 추가
		}
		
		
		//프레임은 기본적으로 border레이아웃이므로 플로우레이아웃 설정해야함
		jp.setLayout(new FlowLayout());
		add(jp); //jframe에 패널을 추가함
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
public static void main(String[] args) {
	new FlowLayoutEx();
	
}
}
