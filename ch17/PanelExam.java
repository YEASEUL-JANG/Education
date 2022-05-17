package ch17;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelExam extends JFrame{
	public PanelExam() {
		JPanel p = new JPanel();//패널생성
		p.setBackground(Color.red);//패널 배경색
		
		JButton button1=new JButton("버튼1");
		JButton button2=new JButton("버튼2");
		JButton button3=new JButton("버튼3");
		JButton button4=new JButton("버튼4");
		JButton button5=new JButton("버튼5");
		JButton button6=new JButton("버튼6");
		
		p.add(button1);
		p.add(button6);
		
		add(p,BorderLayout.NORTH);//프레임에 NORTH영역에 패널을 붙임
		add(button2);//프레임 센터에 버튼2를 붙임
		add(button3,"South");//센터이외는 위치값도 같이 알려줘야 함. (앞글자 대문자)
		add(button4,"West");
		add(button5,"East");
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);//닫기버튼시 완전종료
	
	}//생성자 완료
	public static void main(String[] args) {
		new PanelExam();
		
	}
	
}
