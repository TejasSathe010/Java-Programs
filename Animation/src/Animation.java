//import java.awt.BorderLayout;
import java.awt.Color;
//import java.awt.Component;
import java.awt.Graphics;
//import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Animation {
	int x = 70;
	int y = 70;
	JButton B;
	JFrame F;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animation E = new Animation();
		E.go();
	}
	void go() {
		
		JFrame J = new JFrame();
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		drawPanel d = new drawPanel();
		
		F.getContentPane().add(d);
		F.setSize(300,300);
		F.setVisible(true);
		
		for(int i = 0; i < 130; i++) {
			x++;
			y++;
			d.repaint();
			
			try {
				Thread.sleep(50);
			}catch(Exception Ex) { }
		}
		
		
		
	}
	class drawPanel extends JPanel {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;

		public void paintComponent(Graphics g) {
			g.setColor(Color.green);
			g.fillOval(x, y, 40, 40);
		}
		
	}

}
