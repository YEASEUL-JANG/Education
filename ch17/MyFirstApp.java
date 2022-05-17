package ch17;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFirstApp extends JFrame{
	public MyFirstApp() {
		super("카페메뉴");
		setSize(700,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		JButton[] button = new JButton[5];
		JTextArea ta = new JTextArea(15,40);
		
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		JPanel p5 = new JPanel();
		
		p3.setBackground(Color.DARK_GRAY);
		p1.setBackground(Color.yellow);
		p2.setBackground(Color.yellow);
		p5.setBackground(Color.DARK_GRAY);
		
		JLabel label = new JLabel("커피원두를 고르세요");
		p1.add(label);
		
		
		button[0] = new JButton("케냐AA");
		button[1]= new JButton("과테말라 안티구아");
		button[2]= new JButton("브라질 산토스");
		button[3]= new JButton("에티오피아 예가체프");
		button[4]= new JButton("담은 메뉴");
		
		for(int i=0;i<4;i++) {
			p2.add(button[i]);
		}
		p5.add(button[4]);
		p3.add(p1);
		p3.add(p2);
		add(p3,"North");
		add(p5,"West");
		
		p4.setBackground(Color.darkGray);
		p4.add(ta);
		p4.add(new JScrollPane(ta));
		add(p4);
		
		button[0].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ta.append(button[0].getLabel()+"\n");
			}
		});
		button[1].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ta.append(button[1].getLabel()+"\n");
			}
		});
		button[2].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ta.append(button[2].getLabel()+"\n");
			}
		});
		button[3].addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				ta.append(button[3].getLabel()+"\n");
			}
		});
	
	
	}
public static void main(String[] args) {
	new MyFirstApp();
}
}
