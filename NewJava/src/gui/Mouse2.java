package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Mouse2 extends JFrame{
	JLabel la=new JLabel("no mouse event");
	Mouse2(){
		setTitle("mouse GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		c.addMouseListener(new Mymouse());
		c.addMouseMotionListener(new Mymouse());
		c.add(la);
		
		setSize(300,300);
		setVisible(true);
	}
	
	class Mymouse extends MouseAdapter{

		@Override
		public void mousePressed(MouseEvent e) {
			la.setText("mousePress("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			la.setText("mouseRelaease("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			Container c=(Container)e.getSource();
			c.setBackground(Color.CYAN);
		}

		@Override
		public void mouseExited(MouseEvent e) {
			Container c=(Container)e.getSource();
			c.setBackground(Color.YELLOW);
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			la.setText("mouseDrag("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseMoved(MouseEvent e) {
			la.setText("mouseMove("+e.getX()+","+e.getY()+")");
		}

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
		}
		
	}
	public static void main(String[] args) {
		new Mouse2();
	}

}
