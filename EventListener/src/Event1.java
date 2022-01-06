import javax.swing.*;
//import java.awt.event.*;
import java.awt.*;
//import java.math.*;

@SuppressWarnings("serial")
public class Event1 extends JPanel{

	public void paintComponent(Graphics g) {
		
		Graphics2D g2d = (Graphics2D) g;
		int red = (int) Math.round(Math.random()*100);
		int green = (int) Math.round(Math.random()*100);
		int blue = (int) Math.round(Math.random()*100);
		

		int red1 = (int) Math.round(Math.random()*100);
		int green1 = (int) Math.round(Math.random()*100);
		int blue1 = (int) Math.round(Math.random()*100);
		
		Color random1 = new Color(red,green,blue);
	    Color random2 = new Color(red1,green1,blue1);
		
		GradientPaint gr = new GradientPaint(90,90,random1,150,150,random2);
		
		g2d.setPaint(gr);
		g2d.fillOval(70, 70, 180, 180);
		
		//g.fillRect(0, 0, this.getWidth(), this.getHeight());
	
		//super.paintComponent(g);
		
		//Color random = new Color(red,green,blue);
		
		//g.setColor(random);
		//g.fillOval(70,70,100,100);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Event1 P = new Event1();
		//P.paintComponent();
	}
}
