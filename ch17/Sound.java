package ch17;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener{
private AudioClip audio;//사운드 처리 객체
private JButton play, stop,loop;

@Override
	public void init() {
	//화면 레이아웃변경 (애플릿은 기본이 보더)
	setLayout(new FlowLayout());
	audio = getAudioClip(getClass().getResource("dingdong.wav"));
	play = new JButton("play");
	stop = new JButton("stop");
	loop = new JButton("loop");
	add(play);
	add(stop);
	add(loop);
	
	//버튼클릭 이벤트 기능추가
	play.addActionListener(this);
	stop.addActionListener(this);
	loop.addActionListener(this);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		System.out.println(e.getSource());
		if(btn ==play) {
			audio.play();
		}else if(btn ==stop) {
			audio.stop();
		}else if(btn ==loop) {
			audio.loop();
		}
		
	}
	

}
