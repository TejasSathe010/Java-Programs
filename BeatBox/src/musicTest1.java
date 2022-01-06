//import javax.sound.midi.*;
import javax.swing.*;
import java.awt.event.*;

public class musicTest1 implements ActionListener {
	//void play() throws Throwable {
		//Sequencer s = MidiSystem.getSequencer();
	//}
	JButton B;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame J = new JFrame();
		B = new JButton("Click Me");
		
		B.addActionListener(this);
		
		J.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		J.getContentPane().add(B);
		J.setSize(300,300);
		J.setVisible(true);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
