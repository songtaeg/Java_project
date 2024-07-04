package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame{
	ContentPaneEx(){
		setTitle("GUI"); //이름
		Container c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		
		c.setBackground(Color.cyan);
		c.setLayout(new FlowLayout(FlowLayout.RIGHT,15,20));
		c.add(new JButton("button 1"));
		c.add(new JButton("button 2"));
		c.add(new JButton("button 3"));
		c.add(new JButton("button 4"));
		c.add(new JButton("button 5"));
		
		setSize(300,300); //크기
		setVisible(true); //프레임 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}

}
