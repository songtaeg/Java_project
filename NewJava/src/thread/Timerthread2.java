package thread;

import javax.swing.JLabel;

public class Timerthread2 implements Runnable{
	JLabel timerla;
	Timerthread2(JLabel timerla){
		this.timerla=timerla;
	}
	@Override
	public void run() {
		int n=0;
		while(true) { // 무한루프(1초에 한번씩 n증가)
			timerla.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000); //1초 동안 잠을 잔 후 깨어난다
			} catch (Exception e) {
				return;
			}
		}
		
	}
	

}
