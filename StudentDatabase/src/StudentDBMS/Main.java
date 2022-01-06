package StudentDBMS;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
public class Main extends Frame implements ActionListener,ItemListener
{

	private static final long serialVersionUID = 1L;
	//static Main stu1;
	Connection conn = null;
	Statement stmt = null;
	MainList l1 = null;

	String msg;
	int s_age; 
	String gender_male,gender_female="";
	String s_sex,s_b1,s_b2,s_address,s_course,s_sem,s_campus;


	TextArea t3=new TextArea("");


	MenuBar mb=new MenuBar();  
	Menu menu=new Menu("Database");  
	Menu submenu=new Menu("DB");  
	MenuItem i1=new MenuItem("Connect");  
	MenuItem i2=new MenuItem("Create");  
	MenuItem i3=new MenuItem("Add");  
	MenuItem i4=new MenuItem("Close Connection");  
	MenuItem i5=new MenuItem("Delete All");  


	Button b1=new Button("Connect");
	Button b2=new Button("Create");
	Button b3=new Button("Add");
	Button b4=new Button("Close Connection");
	Button b6=new Button("List");

	Button b5=new Button("Delete All");



	public Main()
	{
		addWindowListener(new myWindowAdapter1());
		setForeground(new Color(50,50,50));
		setBackground(new Color(255, 102, 102));
		setLayout(null);

		Font f = new Font("Calibari",Font.ITALIC,15);
		add(b1);
		b1.setFont(f);
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.BLACK);
		add(b2);
		b2.setFont(f);
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.BLACK);
		add(b3);	
		b3.setFont(f);
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.BLACK);
		add(b4);
		b4.setFont(f);
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.BLACK);
		add(b5);
		b5.setFont(f);
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.RED);
		add(b6);
		b6.setFont(f);
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.BLACK);



		b1.addActionListener(this);
		i1.addActionListener(this);

		b2.addActionListener(this);
		i2.addActionListener(this);

		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);



		add(t3);
		t3.setBackground(new Color(204, 255, 255));
		t3.setForeground(Color.RED);
		t3.setFont(new Font("Calibari",Font.ITALIC,14));


		b1.setBounds(160,150,275,50);
		b2.setBounds(160,200,275,50);
		b3.setBounds(160,250,275,50);
		b4.setBounds(160,300,275,50);
		b6.setBounds(160,350,275,50);
		b5.setBounds(160,550,275,50);



		t3.setBounds(459,135,390,460);


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
		g.setFont(new Font("Calibari",Font.ITALIC,28));
		g.setColor(new Color(204, 255, 255));

		g.drawString("Student Profile Database",320,80);
		g.drawRect(160,115,365,500);
		g.drawRect(435,115,440,500);

	}

	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			conn = Connect.connect();
			try {
				conn.setAutoCommit(false);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
			if(conn != null) {
				t3.setText("\nDatabase Connected...");
			}

		}

		if(ae.getSource()==i1)
		{
			conn = Connect.connect();
			if(conn != null) {
				t3.setText("\nDatabase Connected...");
			}

		}
		if(ae.getSource()==b2)
		{
			stmt = Create.create(conn);
			if(stmt != null) {
				t3.setText("\nDatabase Connected...\n\nTable Created...");
			}

		}
		if(ae.getSource()==i2)
		{
			stmt = Create.create(conn);
			if(stmt != null) {
				t3.setText("\nDatabase Connected...\n\nTable Created...");
			}

		}
		if(ae.getSource()==b3 || ae.getSource()==i3)
		{

			studentawt stu=new studentawt(conn);
			stu.setSize(new Dimension(930,660));
			stu.setTitle("Students Profile");
			stu.setVisible(true);
			this.dispose();

		}

		if(ae.getSource()==b4 || ae.getSource()==i4)
		{
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			t3.setText("\nConnection Closed...");
		}

		if(ae.getSource()==b5 || ae.getSource()==i5)
		{
			String del = "DELETE FROM Student";
			try {
				stmt.executeUpdate(del);
				conn.commit();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t3.setText("\nAll Records Deleted...");
		}
		if(ae.getSource()==b6)
		{
			l1=new MainList(stmt,conn);
			l1.setSize(new Dimension(930,660));
			l1.setTitle("Students Profile Database");
			l1.setVisible(true);
			this.dispose();	
		}
	}


	public void itemStateChanged(ItemEvent ie)
	{

	}
	public static void main(String args[])
	{
		//stu1=new Main();
		//stu1.setSize(new Dimension(930,660));
		//stu1.setTitle("Students Profile Database");
		//stu1.setVisible(true);
	}
}
class myWindowAdapter1 extends WindowAdapter
{
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}