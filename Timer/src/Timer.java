import java.awt.Color;
import java.util.Date;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class Timer {
	JTextArea TA,TB,TC;
	JFrame J;
	JPanel JP,jp;
	JLabel JPa,JPb;
	void go() {
		J = new JFrame("StopWatch");
		JP = new JPanel();
		//jp = new JPanel();

		
		//St = new JLabel("StopWatch");
		TA = new JTextArea(1,3);
		TA.setBackground(Color.green);
		JPa = new JLabel(":");
		TB = new JTextArea(1,3);
		TB.setBackground(Color.green);
		JPb = new JLabel(":");
		TC = new JTextArea(1,3);
		TC.setBackground(Color.green);
		

		//jp.add(St);
		JP.add(TA);
		JP.add(JPa);
		JP.add(TB);
		JP.add(JPb);
		JP.add(TC);

		//J.getContentPane().add(jp);
		J.getContentPane().add(JP);
		J.setSize(200,200);
		J.setVisible(true);
		
		
		for(;;) {
			//System.out.print(D);
			Date D = new Date();
			int H = D.getHours();
			int M = D.getMinutes();
			int S = D.getSeconds();
			
			String  h = String.format("%d", H);
			String  m = String.format("%d", M);
			String  s = String.format("%d", S);

			
			TA.setText(h);
			TB.setText(m);
			TC.setText(s);

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer T = new Timer();
		T.go();

	}

}
