import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.font.FontRenderContext;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Rectangle2D.Double;

import javax.swing.JComponent;
import javax.swing.JFrame;


public class DrawTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame frame = new DrawFrame();
				frame.setTitle("Not Hello World");
				frame.pack();
				frame.setSize(400, 400);
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
			}
		});
	}
}


class DrawFrame extends JFrame{
	DrawFrame() {
		DrawComponent dc = new DrawComponent();
		dc.setForeground(SystemColor.menu);
		add(dc);
		//pack();
	}	
}

class DrawComponent extends JComponent{
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;

		double leftX = 100;
		double topY = 100;
		double width = 200;
		double height = 150;
		
		Rectangle2D rect = new Rectangle2D.Double(leftX , topY , width , height);
		g2.setPaint(Color.RED.darker().darker().brighter());
		//g.drawString(" Ma Bad", 35, 130);
		g2.fill(rect);
		//g2.draw(rect);
		
		Font san = new Font("MonoSpaced",Font.BOLD,14);
		g2.setFont(san);
		String msg = "Ma Bad";
		g2.drawString(msg, 35, 130);
		
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D b = san.getStringBounds(msg,context);

		
		Ellipse2D el = new Ellipse2D.Double();
		el.setFrame(rect);
		//g2.fill(el);
		g2.draw(el);
		
		Line2D l1 = new Line2D.Double(leftX,topY,leftX + width,topY + height);
		Line2D l2 = new Line2D.Double(leftX + width,topY,leftX,topY + height);
		Line2D l3 = new Line2D.Double(leftX + width/2,topY,leftX + width/2,topY + height);
		Line2D l4 = new Line2D.Double(leftX,topY + height/2,leftX + width,topY + height/2);
		g2.draw(l1);
		g2.draw(l2);
		g2.draw(l3);
		g2.draw(l4);
		
		g2.setColor(Color.RED);
		
		
		//System.out.println(rect.getWidth());
		
		//double centerX = el.getCenterX();
		//double centerY = el.getCenterY();
		
		//double radius = 150;
		//Ellipse2D circle = new Ellipse2D.Double();
		//circle.setFrame(centerX,centerY,centerX + radius,centerY + radius);

		//g2.draw(circle);
	}
	public Dimension getPrefferedSize() {
		return new Dimension(400,400);
	}
}