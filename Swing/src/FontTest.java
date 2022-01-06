import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.geom.Line2D;
import java.awt.geom.Line2D.Double;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class FontTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new FontFrame();
		//frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}

class FontFrame extends JFrame{
	public FontFrame() {
		add(new FontComponent());
		pack();
	}
}

class FontComponent extends JComponent{
	
	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(300,200);
	}

	@Override
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		String msg = "Ma Bad!";
		
		Font f = new Font("MonoSpaced",Font.ITALIC,56);
		g2.setFont(f);
		
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D bounds = f.getStringBounds(msg, context);
		
		double x = (getWidth() - bounds.getWidth());
		double y = (getHeight() - bounds.getHeight());
		
		double ascent = -bounds.getY();
		double baseY = y + ascent;
		
		System.out.println();
		
		
		g2.drawString(msg, (int)x, (int)baseY);
		
		g2.setPaint(Color.LIGHT_GRAY);
		
		g2.draw(new Line2D.Double(x, baseY, x + bounds.getWidth(), baseY));
		
		Rectangle2D rect = new Rectangle2D.Double(x,y,bounds.getWidth(),bounds.getHeight());
		
		g2.draw(rect);	
		
	}
}