import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//import java.awt.*;

//import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class swing extends WindowAdapter implements ActionListener
{

	functionality f1 = new functionality();
	JFrame f;
	JMenuBar mb;
	JMenu m1,m2,m3,m4;
	JMenuItem s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,save;
	JTextArea a1;
	//JMenuItem i1,i2,i3;
	swing(){
		//frame
		f= new JFrame("NotePad");

		//menu
		m1=new JMenu("File");
		m2=new JMenu("Edit");
		m3=new JMenu("Project");
		m4=new JMenu("Help");

		//menuitem

		//m1file
		s1=new JMenuItem("New");
		s1.addActionListener(this);
		s2=new JMenuItem("Open File");
		s2.addActionListener(this);
		save=new JMenuItem("Save");
		save.addActionListener(this);

		//m2edit
		s3=new JMenuItem("Copy");
		s4=new JMenuItem("Paste");
		s5=new JMenuItem("Cut");

		//m3project
		s6=new JMenuItem("Open Project");
		s7=new JMenuItem("Close Project");
		s8=new JMenuItem("Build Project");

		//m4help
		s9=new JMenuItem("Search");
		s10=new JMenuItem("Contribute");

		//menubar
		mb=new JMenuBar();

		//m1file
		m1.add(s1);
		m1.addSeparator();
		m1.add(s2);
		m1.addSeparator();
		m1.add(save);

		//m2edit
		m2.add(s3);
		m2.addSeparator();
		m2.add(s4);
		m2.addSeparator();
		m2.add(s5);

		//m3project
		m3.add(s6);
		m3.addSeparator();
		m3.add(s7);
		m3.addSeparator();
		m3.add(s8);

		//m4help
		m4.add(s9);
		m4.addSeparator();
		m4.add(s10);

		//menu item add
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		mb.add(m4);

		//menubarset
		f.setJMenuBar(mb);

		a1=new JTextArea();
		a1.setBounds(30, 30, 530, 500);
		f.add(a1);


		f.addWindowListener(this);
		f.setSize(600,600);  
		f.setLayout(null); 
		f.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		f.setVisible(true);
	}
	//Window Closing Activity
	public void windowClosing(WindowEvent e) {
		int a = JOptionPane.showConfirmDialog(f, "Are You Sure?");
		if(a==JOptionPane.YES_OPTION) {
			f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
	}

	//Menu Bar Activity
	public void actionPerformed(ActionEvent e) {    
		if(e.getSource()== s1) {
			a1.setText("");	
		}//new
		
		if(e.getSource()== s2) {
			JFileChooser fc = new JFileChooser();
			int i = fc.showOpenDialog(f);
		}//open
		
		if(e.getSource()==save) {
			
		}//save
	}

	public static void main(String args[])  
	{  
		new swing();
	}  
}  