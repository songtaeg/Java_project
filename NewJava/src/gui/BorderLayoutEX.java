package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutEX extends JFrame{
	BorderLayoutEX(){
		setTitle("GUI"); //이름
		Container c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(new FlowLayout());
		
		c.setBackground(Color.gray);
		c.setLayout(new BorderLayout(20,30));

		c.add(new JButton("button 1"),BorderLayout.WEST);
		c.add(new JButton("button 2"),BorderLayout.CENTER);
		c.add(new JButton("button 3"),BorderLayout.SOUTH);
		c.add(new JButton("button 4"),BorderLayout.NORTH);
		c.add(new JButton("button 5"),BorderLayout.EAST);
		
		setSize(300,300); //크기
		setVisible(true); //프레임 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BorderLayoutEX();
	}

}
