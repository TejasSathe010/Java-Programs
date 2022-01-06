import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JComponent;
import javax.swing.JFrame;

import javafx.scene.paint.Color;

public class NotHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = new NotHelloWorlFrame();
				frame.setTitle("Not Hello World");
				frame.pack();
				frame.setSize(400, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}


class NotHelloWorlFrame extends JFrame{
	NotHelloWorlFrame() {
		add(new NotHelloWorlComponent());
		//pack();
	}	
}

class NotHelloWorlComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		Line2D l = new Line2D.Double(40,80, 45, 34);
		Ellipse2D r2 = new Ellipse2D.Double(150, 100, 100, 50);
		Rectangle2D r3 = new Rectangle2D.Double();
		r3.setFrameFromDiagonal(150, 100, 100, 50);
		Point2D p = new Point2D.Double(10, 20);

		
		g2.draw(r2);
		g2.draw(l);
		g2.draw(r3);



		//g.drawString("Not Hello World Program", 75, 100);
	}
	public Dimension getPrefferedSize() {
		return new Dimension(300,200);
	}
}