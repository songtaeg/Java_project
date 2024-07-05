package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CheckBoxEx extends JFrame{
	JCheckBox[] check=new JCheckBox[3];
	String[] name= {"사과","바나나","포도"};
	JLabel la;
	CheckBoxEx(){
		setTitle("체크박스");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("사과 3000원, 바나나 5000원, 포도 4500원"));
		
		for(int i=0; i<check.length; i++) {
			check[i]=new JCheckBox(name[i]);
			check[i].setBorderPainted(true);
			c.add(check[i]);
			check[i].addItemListener(new Myitem());
		}
		
		la=new JLabel("현재 0원");
		c.add(la);
		setSize(250,300);
		setVisible(true);
	}
	
	class Myitem implements ItemListener{
		int sum=0;
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange()==ItemEvent.SELECTED) {
				if(e.getItem()==check[0]) {
					sum+=3000;
				}
				else if(e.getItem()==check[1]) {
					sum+=5000;
				}	
				else
					sum+=4500;
			}
			else {
				if(e.getItem()==check[0])
					sum-=3000;
				else if(e.getItem()==check[1])
					sum-=5000;
				else
					sum-=4500;
			}
			la.setText("현재 "+sum+"원");
		}
	}
	public static void main(String[] args) {
		new CheckBoxEx();

	}

}
