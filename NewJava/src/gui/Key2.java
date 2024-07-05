package gui;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Key2 extends JFrame{
	JLabel la=new JLabel("hello"); 
	Key2(){
		setTitle("move gui");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(null);
		c.addKeyListener(new Mykey());
		
		la.setLocation(50,50);
		la.setSize(100,20);
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
		
	}
	class Mykey extends KeyAdapter{

		@Override
		public void keyPressed(KeyEvent e) {
			int keycode=e.getKeyCode();
			if(keycode==KeyEvent.VK_UP) {
				la.setLocation(la.getX(),la.getY()-10);
			}
			else if(keycode==KeyEvent.VK_DOWN) {
				la.setLocation(la.getX(),la.getY()+10);
			}
			else if(keycode==KeyEvent.VK_LEFT) {
				la.setLocation(la.getX()-10,la.getY());
			}
			else if(keycode==KeyEvent.VK_RIGHT) {
				la.setLocation(la.getX()+10,la.getY());
			}
		}
		
	}
	public static void main(String[] args) {
		new Key2();
	}

}
