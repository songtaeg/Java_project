package gui;

import javax.swing.JFrame;

public class MyFrame extends JFrame{
	MyFrame(){
		setTitle("300x300 프레임"); //이름
		setSize(300,300); //크기
		setVisible(true); //프레임 출력
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame my =new MyFrame();
	}

}
