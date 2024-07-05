package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyListenerEx extends JFrame{
	private JLabel [] keyMessage; 
	KeyListenerEx(){
		setTitle("GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		setSize(300,150);
		setVisible(true);
		
		c.addKeyListener(new Mykey());
		
		keyMessage = new JLabel [3]; 
		keyMessage[0] = new JLabel(" getKeyCode() ");
		keyMessage[1] = new JLabel(" getKeyChar() ");
		keyMessage[2] = new JLabel(" getKeyText() ");
		
		for(int i=0; i<keyMessage.length; i++) {
			c.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.orange);
		}
		
		c.setFocusable(true);
		c.requestFocus();
	
	}
	
	class Mykey extends KeyAdapter{
		@Override
		public void keyPressed(KeyEvent e) {
			int code=e.getKeyCode();
			char ch=e.getKeyChar();
			
			keyMessage[0].setText(Integer.toString(code));
			keyMessage[1].setText(Character.toString(ch));
			keyMessage[2].setText(e.getKeyText(code));
		}
		
	}
	public static void main(String[] args) {
		new KeyListenerEx();

	}

}
