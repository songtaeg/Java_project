package gui;

import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class NullContainerEx extends JFrame{
	 NullContainerEx(){
		setTitle("GUI"); //이름
		Container c=getContentPane();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c.setLayout(null);
			
		JLabel l=new JLabel("hello press button");
		l.setLocation(130,50);
		l.setSize(200,20);
		c.add(l);
			
		for(int i=1; i<=9; i++) {
			JButton b=new JButton(Integer.toString(i));
			b.setLocation(i*15,i*15);
			b.setSize(50,20);
			c.add(b);
		}
			setSize(300,300); //크기
			setVisible(true); //프레임 출력
	 }
	public static void main(String[] args) {
		new NullContainerEx();

	}

}
