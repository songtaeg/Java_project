package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Key extends JFrame{
	JLabel la=new JLabel();
	Key(){
		setTitle("key code 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane(); 

		c.setLayout(new FlowLayout());
		c.addKeyListener(new key());
		c.add(la);

		setSize(300,300);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();
	}
	
	class key extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			Container c=(Container)e.getSource();
			la.setText(e.getKeyText(e.getKeyCode()));
						
			if(e.getKeyChar()=='%') {
				c.setBackground(Color.YELLOW);			 
			}else if(e.getKeyCode()==KeyEvent.VK_F1) {
				c.setBackground(Color.GREEN);
			} else if(e.getKeyCode() == KeyEvent.VK_9) {
				la.setOpaque(true);
				la.setBackground(Color.pink); 
            }
		}
	}
	public static void main(String[] args) {
		new Key();

	}

}
