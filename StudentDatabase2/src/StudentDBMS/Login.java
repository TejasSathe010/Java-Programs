package StudentDBMS;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.Statement;
public class Login extends Frame implements ActionListener,ItemListener
{

	private static final long serialVersionUID = 1L;
	static Login stu2;
	static Main stu1;

	Connection conn = null;
	Statement stmt = null;

	String userName = "@abc123";
	String Pwd = "12345";


	TextArea t1=new TextArea("");
	TextArea t2=new TextArea("");


	Label l1=new Label("ID :",Label.CENTER);
	Label l2=new Label("Password :",Label.CENTER);
	TextArea t3=new TextArea("");



	MenuBar mb=new MenuBar();  
	Menu menu=new Menu("Database");  
	Menu submenu=new Menu("DB");  
	MenuItem i1=new MenuItem("Connect");  
	MenuItem i2=new MenuItem("Create");  
	MenuItem i3=new MenuItem("Add");  
	MenuItem i4=new MenuItem("Close Connection");  
	MenuItem i5=new MenuItem("Delete All");  


	Button b1=new Button("Log In");




	public Login()
	{
		addWindowListener(new myWindowAdapter1());
		setForeground(new Color(50,50,50));
		setBackground(new Color(255, 102, 102));
		setLayout(null);



		add(b1);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.BLACK);


		b1.addActionListener(this);



		add(t1);
		add(t2);



		l1.setBounds(280,170,80,20);
		l1.setForeground(Color.BLACK);
		l1.setBackground(new Color(204, 255, 255));
		l2.setBounds(280,270,80,20);
		l2.setBackground(new Color(204, 255, 255));
		l2.setForeground(Color.BLACK);


		add(l1);
		add(l2);


		b1.setBounds(330,450,300,50);




		t1.setBounds(380,150,300,60);
		t1.setForeground(Color.WHITE);
		t1.setBackground(new Color(255, 102, 102));
		t2.setBounds(380,250,300,60);
		t2.setBackground(new Color(255, 102, 102));
		t2.setForeground(Color.WHITE);


		menu.add(i1);  
		menu.add(i2);  
		menu.add(i3);  
		submenu.add(i4);  
		submenu.add(i5);  
		menu.add(submenu);  
		mb.add(menu);  
		setMenuBar(mb); 

	}





	public void paint(Graphics g)
	{ 

		g.setFont(new Font("Serif", Font.ITALIC, 30));
		g.setColor(new Color(204, 255, 255));


		g.drawString("Student Profile Database",320,80);

		g.drawRect(150,115,630,520);

		g.fillRect(165,125,600,500);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			stu1=new Main();
			stu1.setSize(new Dimension(930,660));
			stu1.setTitle("Students Profile Database2");
			stu1.setVisible(true);
			this.dispose();
			String input_ip = t1.getText();
			String input_pass = t2.getText();

			if(input_ip.equals(userName) && input_pass.equals(Pwd)) {

			}
		}
	}
	public void itemStateChanged(ItemEvent ie)
	{

	}
	public static void main(String args[])
	{
		stu2=new Login();
		stu2.setSize(new Dimension(930,660));
		stu2.setTitle("Students Profile Database");
		stu2.setVisible(true);
	}
}
class myWindowAdapter3 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}

