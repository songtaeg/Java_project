package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GridLayoutEx extends JFrame{
	GridLayoutEx(){
		setTitle("GUI"); //이름
		Container c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout grid=new GridLayout(4,2);
		grid.setVgap(10);
		c.setLayout(grid);
		
		c.add(new JLabel("이름"));
		c.add(new TextField());
		c.add(new JLabel("학번"));
		c.add(new TextField());
		c.add(new JLabel("학과"));
		c.add(new TextField());
		c.add(new JLabel("과목"));
		c.add(new TextField());
		
		setSize(300,300); //크기
		setVisible(true); //프레임 출력
	}
	public static void main(String[] args) {
		new GridLayoutEx();

	}

}
