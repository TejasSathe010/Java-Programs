import java.awt.*;
import javax.swing.*;

public class SimpleFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				SimpleFrame frame = new SimpleFrame();
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				
				//frame.setLocation(45, 100);
				//frame.toFront();
				//frame.setExtendedState(Frame.MAXIMIZED_BOTH);
				//frame.toBack();
				//frame.setLocationByPlatform(true);
				//frame.setUndecorated(true);
				
				frame.setVisible(true);
				System.out.print("Title Is " + frame.getTitle());
				System.out.println("Resizable  " + frame.isResizable());

			}
		});
	}
}

class SimpleFrame extends JFrame{
	//private static final int W = 300;
	//private static final int H = 300;
	
	Toolkit kit = Toolkit.getDefaultToolkit();
	Dimension size = kit.getScreenSize();
	
	
	int W = size.width;
	int H = size.height;

	public SimpleFrame() {
		setSize(W/2,H/2);
		//setBounds(50,50,500,500);
		

		setTitle("MyTitle");
		Image img = new ImageIcon("trans.png").getImage();
		setIconImage(img);
	}

}
