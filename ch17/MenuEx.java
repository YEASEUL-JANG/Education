package ch17;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuEx extends JFrame{
	//Exit 만 메뉴아이템으로 별도생성
	private JMenuItem mie = new JMenuItem("Exit");
	
	public MenuEx() {
		super("Menu예제");
		createMenu();
		setSize(300,200);
		setVisible(true);
	}
	void createMenu() {
		JMenuBar mb = new JMenuBar(); //메뉴바 생성
		JMenu jm = new JMenu("File"); //메뉴생성
		jm.add(new JMenuItem("Open"));//메뉴 안의 메뉴생성
		jm.add(new JMenuItem("Save"));//메뉴 안의 메뉴생성
		jm.add(new JMenuItem("Print"));//메뉴 안의 메뉴생성
		jm.addSeparator();//메뉴에 분리선 추가
		jm.add(mie);
		mb.add(jm);// 메뉴바에 메뉴를 붙임
		mb.add(new JMenu("Edit"));// 메뉴바에 메뉴를 붙임
		mb.add(new JMenu("Project"));// 메뉴바에 메뉴를 붙임
		mb.add(new JMenu("Run"));// 메뉴바에 메뉴를 붙임
		
		//프레임에 메뉴바 붙이기(메뉴바는 프레임에만 부착가능)
		setJMenuBar(mb);
		
		//Exit메뉴아이템에 이벤트처리 - 클릭하면 프로그램종료
		mie.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}//end creatMenu()
	public static void main(String[] args) {
		new MenuEx();
}
}
