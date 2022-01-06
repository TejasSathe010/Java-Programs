import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.event.*;

public class Event implements ActionListener {
	JCheckBox B;
	JFrame F;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event E = new Event();
		E.go();
	}
	void go() {
		
		JFrame F = new JFrame();
		B = new JCheckBox("Click Me");
		B.addActionListener(this);
		Event1 E1 = new Event1();
		F.add(E1);
		
		F.getContentPane().add(BorderLayout.SOUTH,B);
		F.getContentPane().add(BorderLayout.CENTER,E1);
		F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		F.setSize(300,300);
		F.setVisible(true);
	}

	public void actionPerformed(ActionEvent event) {
		F.repaint();
	}
}
