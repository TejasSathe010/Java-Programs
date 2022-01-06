package Timer;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TimerTest1 A = new TimerTest1(10000,true);
		A.start();
		
		JFrame j = new JFrame("FrameJ");
		JOptionPane.showMessageDialog(j, "Quit Program?");
		j.setSize(500, 500);
		j.setVisible(true);
		System.exit(0);
	}
}


class TimerTest1{
	Timer T;
	private int interval;
	private boolean beep;
	
	TimerTest1(int interval,boolean beep){
		this.interval = interval;
		this.beep = beep;
	}
	
	void start() {
		ActionListener l = new TimePrinter();
		T = new Timer(interval,l);
		T.start();
	}
	
	class TimePrinter implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			Date d = new Date();
			System.out.println("Beeps At" + d);
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
		
	}
}	

