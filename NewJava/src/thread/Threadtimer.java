package thread;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Threadtimer extends JFrame{
	Threadtimer(){
		setTitle("타이머 스레드");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timer=new JLabel();
		timer.setFont(new Font("Gothic", Font.ITALIC, 50));
		c.add(timer);
		
		Timerthread th=new Timerthread(timer); //스레드 객체 생성
		
		setSize(300,200);
		setVisible(true);
		
		th.start(); //스레드 시작
	}

	public static void main(String[] args) {
		new Threadtimer();
	}

}